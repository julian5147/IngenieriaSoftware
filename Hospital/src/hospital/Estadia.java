package hospital;

import java.util.Date;

public class Estadia {
	private Date fechaIngreso;
	private Date fechaSalida;
	private String enfermedad;
	private Paciente paciente;

	public Estadia(Paciente paciente, Date fechaIngreso, String enfermedad) {
		this.paciente = paciente;
		this.fechaIngreso = fechaIngreso;
		this.enfermedad = enfermedad;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}
}
