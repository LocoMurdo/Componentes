package Service;

import java.util.EventObject;
import java.util.List;

import javax.persistence.EntityManager;

import Entity.Profesor;
import Intefaces.IMantenimiento;

public class ServicioProfesor extends Servicio implements IMantenimiento<Profesor> {

	@Override
	public Profesor encontarPK(EntityManager em, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(EntityManager em, Profesor obj) {
		try {

			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception E) {
			E.printStackTrace();
		}
	}

	@Override
	public void eliminar(EntityManager em, Profesor obj) {
		try {

			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
	

	@Override
	public void modificar(EntityManager em, Profesor obj) {
		try {

			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
}
