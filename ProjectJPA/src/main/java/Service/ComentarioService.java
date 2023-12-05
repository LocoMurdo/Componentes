package Service;

import java.util.List;

import javax.persistence.EntityManager;

import Intefaces.Icrud;
import Models.ComentarioTO;

public class ComentarioService implements Icrud<ComentarioTO> {

	@Override
	public ComentarioTO encontarPK(EntityManager em, Object obj) {
	
		return null;
	}

	@Override
	public List<ComentarioTO> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(EntityManager em, ComentarioTO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(EntityManager em, ComentarioTO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(EntityManager em, ComentarioTO obj) {
		// TODO Auto-generated method stub
		
	}

}
