package Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proyectos
 *
 */
@Entity

public class Proyectos implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombreProyecto;

    @ManyToOne
    @JoinColumn(name = "id_empleado_lider")
    private Empleados liderProyecto;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmpleadoProyecto> empleadosEnProyecto;
	private static final long serialVersionUID = 1L;

	public Proyectos() {
		super();
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
	
   
}
