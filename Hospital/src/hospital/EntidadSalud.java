package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntidadSalud {
	private List<Hospital> hospitales;
	private List<Paciente> pacientes;
	

	public EntidadSalud() {
		this.hospitales = new ArrayList<>();
		this.pacientes = new ArrayList<>(); 
	
	}
	
	public Hospital buscarHospitalAsignar(Date fechaInicio, String enfermedad) {
		
		int mayorDisponibles = 0;
		Hospital seleccionado = null;
		for (Hospital hospital : hospitales) {
			if (hospital.tieneEspecialista(enfermedad)) {
				int disponibles = hospital.camasDisponibles(fechaInicio);
				if (disponibles > mayorDisponibles) {
					mayorDisponibles = disponibles;
					seleccionado = hospital;
				}
			}
		}
		return seleccionado;
	}

	public Paciente buscarPaciente(String idPaciente) {
		for (Paciente paciente : pacientes) {
			if (idPaciente.equals(paciente.getId())) {
				return paciente;
			}
		}
		return null;
	}

	public String asignarHospital(String idPaciente, Date fechaInicio, String enfermedad) throws HospitalNoValido {
		Paciente paciente = buscarPaciente(idPaciente);
		Hospital hospital = buscarHospitalAsignar(fechaInicio, enfermedad);
		if (hospital == null) {
			throw new HospitalNoValido("No se puedo asignar ningun hospital");
		}
		hospital.asignar(paciente, fechaInicio, enfermedad);
		return hospital.getNombre();
	}
}
