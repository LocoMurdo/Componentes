package Service;

import javax.persistence.EntityManager;
import java.util.List;

import Intefaces.EntityManager;
import Intefaces.Icrud;
import Models.EmpleadoTO;

public class EmpleadosService implements Icrud<EmpleadoTO>{

	@Override
	public EmpleadoTO encontarPK(EntityManager em, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoTO> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(EntityManager em, EmpleadoTO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(EntityManager em, EmpleadoTO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(EntityManager em, EmpleadoTO obj) {
		// TODO Auto-generated method stub
		
	}

}
