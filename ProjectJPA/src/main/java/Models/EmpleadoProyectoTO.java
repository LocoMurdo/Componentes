package Models;

import java.io.Serializable;
<<<<<<< HEAD
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import Entity.Empleados;
import Entity.Proyectos;

public class EmpleadoProyectoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Empleados empleado;

	private Proyectos proyecto;

	private Date fechaInicio;
	private Date fechaFin;

	public EmpleadoProyectoTO(Integer id, Empleados empleado, Proyectos proyecto, Date fechaInicio, Date fechaFin) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.proyecto = proyecto;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
