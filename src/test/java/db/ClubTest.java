package db;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import canchas.Cancha;
import canchas.Club;
import canchas.Color;

public class ClubTest extends AbstractPersistenceTest implements WithGlobalEntityManager{
	
	private Club club;
	
	@Before
	public void setUp(){
		club = new Club();
	}
	
	@Test
	public void alPedirleQueGuardeUnaCanchaPersiste() {
		Cancha cancha = new Cancha("Cancha uno");
		club.registrar(cancha);
		Assert.assertEquals(club.obtenerCancha(cancha.getCanchaId()), cancha);
	}
	
	@Test
	public void guardarUnaCanchaGuardaSuColor(){
		Cancha cancha = new Cancha("Cancha uno", new Color("rojo"));
		club.registrar(cancha);
		Assert.assertEquals(club.obtenerCancha(cancha.getCanchaId()), cancha);
		Assert.assertEquals(club.obtenerCancha(cancha.getCanchaId()).getColor(), cancha.getColor());
	}

}
