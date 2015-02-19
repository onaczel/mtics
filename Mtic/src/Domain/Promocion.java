package Domain;

import java.util.List;

public class Promocion {
	
	

	private int id;
	private String nombre;
	private String observaciones;
	private List<Alumno> alumno;
	

	public Promocion(String nombre, String observaciones){
		this.nombre= nombre;
		this.observaciones= observaciones;
	}
	
	
	
	public List<Alumno> getAlumnos() {
		return alumno;
	}

	public void setAlumnos(List<Alumno> alumnos) {
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
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

	
	
}
