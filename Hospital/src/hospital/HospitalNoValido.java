package hospital;

@SuppressWarnings("serial")
public class HospitalNoValido extends Exception{
	public HospitalNoValido(String mensaje) {
		super (mensaje);
	}
}
