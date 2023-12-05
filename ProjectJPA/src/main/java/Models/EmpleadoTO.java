package Models;

import java.io.Serializable;

<<<<<<< HEAD
=======


>>>>>>> 6b43ea0add943467997f58068173fa0708a2e587
import Entity.Usuarios;
import Enums.Puesto;

public class EmpleadoTO implements Serializable {

	private Integer id;

	private String nombre;

	private Puesto puesto;

	private Usuarios usuario;

	private static final long serialVersionUID = 1L;

	public EmpleadoTO(Integer id, String nombre, Puesto puesto, Usuarios usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
