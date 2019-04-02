package hospital;

import java.util.HashSet;
import java.util.Set;

public class Especialista {

	private Set<String> enfermedades;

	public Especialista() {
		this.enfermedades = new HashSet<>();
	}

	public boolean especialistaEn(String enfermedad) {
		for (String e : enfermedades) {
			return e.equals(enfermedad);
		}
		return false;
	}
}
