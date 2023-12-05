package Models;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.List;

import Entity.Comentario;
import Entity.EmpleadoProyecto;
import Entity.Empleados;

public class ProyectoTO implements Serializable {

	private Integer id;

	private String nombreProyecto;

	private Empleados liderProyecto;

	private List<Comentario> comentarios;

	private List<EmpleadoProyecto> empleadosEnProyecto;
	
	private static final long serialVersionUID = 1L;

	public ProyectoTO(Integer id, String nombreProyecto, Empleados liderProyecto, List<Comentario> comentarios,
			List<EmpleadoProyecto> empleadosEnProyecto) {
		super();
		this.id = id;
		this.nombreProyecto = nombreProyecto;
		this.liderProyecto = liderProyecto;
		this.comentarios = comentarios;
		this.empleadosEnProyecto = empleadosEnProyecto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public Empleados getLiderProyecto() {
		return liderProyecto;
	}

	public void setLiderProyecto(Empleados liderProyecto) {
		this.liderProyecto = liderProyecto;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<EmpleadoProyecto> getEmpleadosEnProyecto() {
		return empleadosEnProyecto;
	}

	public void setEmpleadosEnProyecto(List<EmpleadoProyecto> empleadosEnProyecto) {
		this.empleadosEnProyecto = empleadosEnProyecto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
