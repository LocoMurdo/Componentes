package Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmpleadoProyecto
 *
 */
@Entity

public class EmpleadoProyecto implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @ManyToOne
	    @JoinColumn(name = "id_empleado")
	    private Empleados empleado;

	    @ManyToOne
	    @JoinColumn(name = "id_proyecto")
	    private Proyectos proyecto;

	    private Date fechaInicio;
	    private Date fechaFin;
	
	private static final long serialVersionUID = 1L;

	public EmpleadoProyecto() {
		super();
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
	
   
}
