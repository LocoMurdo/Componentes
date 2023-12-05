package Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Experencia_Laboral
 *
 */
@Entity

public class Experencia_Laboral implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @ManyToOne
	    @JoinColumn(name = "id_empleado")
	    private Empleados empleado;

	    @Lob
	    private byte[] curriculum;
	
	private static final long serialVersionUID = 1L;

	public Experencia_Laboral() {
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

	public byte[] getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(byte[] curriculum) {
		this.curriculum = curriculum;
	}
   
}
