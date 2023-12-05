package Tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LevantamientoDeRequisitos {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectJPA");

	   
	        EntityManager em = emf.createEntityManager();

	       
	        em.close();
	        emf.close();

	}

}
