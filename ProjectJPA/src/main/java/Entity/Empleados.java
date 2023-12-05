package Entity;

import java.io.Serializable;
import javax.persistence.*;

import Enums.Puesto;

/**
 * Entity implementation class for Entity: Empleados
 *
 */
@Entity

public class Empleados implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

	 @Column(nullable = false)
	    private String nombre;
	 
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Puesto puesto;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;
	
	private static final long serialVersionUID = 1L;

	public Empleados() {
		super();
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
	
   
}
