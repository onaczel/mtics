package Domain;

public class Alumno {
	
	private int id;
	private int nro_documento;	
	private String nombre;
	private String apellido;
	private String observaciones;
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public int getNro_documento() {
		return nro_documento;
	}
	
	public void setNro_documento(int nro_documento) {
		this.nro_documento = nro_documento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	

}

