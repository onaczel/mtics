package Domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Enfasis {
	
	private int id;
	private String nombre;
	private String observaciones;
	List<Promocion> promocion;
	
	public List<Promocion> getPromocion() {
		return promocion;
	}

	public void setPromocion(List<Promocion> promocion) {
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
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	

}
