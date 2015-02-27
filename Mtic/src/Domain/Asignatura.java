package Domain;

import java.util.Date;
import java.util.Set;

public class Asignatura extends Domain {

	private int id;
	private String nombre;
	private int cargaHoraria;
	private Date acta1fecha;
	private int acta1Numero;
	private Date acta2fecha;
	private int acta2Numero;

	private Set<Promocion> promocion;
	private Set<Profesor> profesor;

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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Date getActa1fecha() {
		return acta1fecha;
	}

	public void setActa1fecha(Date acta1fecha) {
		this.acta1fecha = acta1fecha;
	}

	public int getActa1Numero() {
		return acta1Numero;
	}

	public void setActa1Numero(int acta1Numero) {
		this.acta1Numero = acta1Numero;
	}

	public Date getActa2fecha() {
		return acta2fecha;
	}

	public void setActa2fecha(Date acta2fecha) {
		this.acta2fecha = acta2fecha;
	}

	public int getActa2Numero() {
		return acta2Numero;
	}

	public void setActa2Numero(int acta2Numero) {
		this.acta2Numero = acta2Numero;
	}

	public Set<Promocion> getPromocion() {
		return promocion;
	}

	public void setPromocion(Set<Promocion> promocion) {
		this.promocion = promocion;
	}

}
