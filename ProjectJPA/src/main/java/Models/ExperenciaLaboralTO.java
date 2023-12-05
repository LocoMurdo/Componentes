package Models;

import java.io.Serializable;





import Entity.Empleados;

public class ExperenciaLaboralTO implements Serializable {


	private Integer id;

	private Empleados empleado;

	private byte[] curriculum;
	
	private static final long serialVersionUID = 1L;

	public ExperenciaLaboralTO(Integer id, Empleados empleado, byte[] curriculum) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.curriculum = curriculum;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
