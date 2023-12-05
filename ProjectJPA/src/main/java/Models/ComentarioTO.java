package Models;

import java.io.Serializable;

import Entity.Proyectos;

public class ComentarioTO implements Serializable{

	private Integer id;
	private String texto;
	private Proyectos proyecto;
	private static final long serialVersionUID = 1L;
	public ComentarioTO(Integer id, String texto, Proyectos proyecto) {
		super();
		this.id = id;
		this.texto = texto;
		this.proyecto = proyecto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Proyectos getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
