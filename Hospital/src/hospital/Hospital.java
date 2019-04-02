package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {
	private String nombre;
	private int capacidadCamas;
	private List<Especialista> especialistas;
	private List<Estadia> estadias;

	public Hospital() {
		this.especialistas = new ArrayList<>();
		this.estadias = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public boolean tieneEspecialista(String enfermedad) {
		for (Especialista especialista : especialistas) {
			return especialista.especialistaEn(enfermedad);
		}
		return false;
	}

	public int camasDisponibles(Date fecha) {
		int cantDisponibles = this.capacidadCamas;
		for (Estadia estadia : estadias) {
			if ((estadia.getFechaSalida() == null && 
				fecha.after(estadia.getFechaIngreso()) || fecha.equals(estadia.getFechaIngreso()))) {
				cantDisponibles--;
			}
		}
		return cantDisponibles;
	}

	public boolean asignar(Paciente paciente, Date fechaInicio, String enfermedad) {
		return estadias.add(new Estadia(paciente, fechaInicio, enfermedad));
	}
}
