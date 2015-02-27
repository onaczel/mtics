package Domain;

import java.util.Set;

public class Promocion extends Domain {

	private int id;
	private String nombre;

	private Set<Alumno> alumno;

	public Promocion(String nombre, String observaciones) {
		this.nombre = nombre;
		this.observaciones = observaciones;
	}

	public Set<Alumno> getAlumnos() {
		return alumno;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumno = alumnos;
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
