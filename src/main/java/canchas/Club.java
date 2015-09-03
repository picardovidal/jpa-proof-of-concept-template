package canchas;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

public class Club implements WithGlobalEntityManager{

	
	public void registrar(Cancha unaCancha){
		entityManager().persist(unaCancha);
	}
	
	public Cancha obtenerCancha(Long canchaId){
		return entityManager().find(Cancha.class, canchaId);
	}
}
