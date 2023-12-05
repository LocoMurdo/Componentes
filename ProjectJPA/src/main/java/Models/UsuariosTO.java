package Models;

import java.io.Serializable;

import java.time.LocalDateTime;



import Enums.Rol;

public class UsuariosTO implements Serializable {

	private Integer id;

	private String correo;

	private String clave;

	private Rol rol;

	private LocalDateTime fechaRegistro;

	private static final long serialVersionUID = 1L;

	public UsuariosTO(Integer id, String correo, String clave, Rol rol, LocalDateTime fechaRegistro) {
		super();
		this.id = id;
		this.correo = correo;
		this.clave = clave;
		this.rol = rol;
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
