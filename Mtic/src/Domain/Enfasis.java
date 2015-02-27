package Domain;

import java.util.Set;

public class Enfasis extends Domain {

	private int id;
	private String nombre;
	private Set<Promocion> promocion;

	public Set<Promocion> getPromocion() {
		return promocion;
	}

	public void setPromocion(Set<Promocion> promocion) {
		this.promocion = promocion;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
