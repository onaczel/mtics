package Domain;

import java.util.Date;
import java.util.Set;

public class Clase extends Domain {

	private int id;
	private Date fecha;
	private int cargaHoraria;
	private Set<Asignatura> asignaturas;

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

}
