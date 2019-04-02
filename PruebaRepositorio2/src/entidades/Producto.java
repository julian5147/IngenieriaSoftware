package entidades;

public class Producto {
	private String codigo;
	private double precio;
	
	public Producto(String codigo,double precio) {
		this.codigo=codigo;

	}

	public String getCodigo(){
	 return this.codigo;
	}

	public double getPrecioo(){
	 return this.precio;
	}
}
