package entidades;

public class Cliente {
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;

	public Cliente(String cedula, String nombre) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
}
