package db;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import canchas.Cancha;
import canchas.Color;
import canchas.Jugador;
import canchas.JugadorAmateur;
import canchas.JugadorProfesional;
import canchas.Paleta;
import canchas.Predio;

public class ClubTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  private Predio predio;

  @Before
  public void setUp() {
    predio = new Predio();
  }

  @Test
  public void alPedirleQueGuardeUnaCanchaPersiste() {
    Cancha cancha = new Cancha("Cancha uno");
    predio.registrar(cancha);
    cancha.setNombre("lalalala");

    assertEquals(predio.obtenerCancha(cancha.getId()), cancha);
  }

  @Test
  public void guardarUnaCanchaGuardaSuColor() {

    Cancha cancha = new Cancha("Cancha uno", new Color("rojo"));

    predio.registrar(cancha);

    assertEquals(predio.obtenerCancha(cancha.getId()), cancha);
   
    assertEquals(predio.obtenerCancha(cancha.getId()), cancha);
  }

  @Test
  public void testName() throws Exception {
    Cancha cancha = new Cancha("Cancha uno", new Color("rojo"));

    
    Paleta paletaA = new Paleta();
    Paleta paletaB = new Paleta();
    
    Jugador jose = new JugadorAmateur();
    jose.setPaleta(paletaA);
    Jugador maria = new JugadorProfesional();
    jose.setPaleta(paletaB);

    entityManager().persist(jose);
    entityManager().persist(maria);

    cancha.reservar(LocalDateTime.now(),//
        Arrays.asList(jose, maria));
    
    predio.registrar(cancha);
    
  }
  
  @Test
  public void testName2() throws Exception {
    List<Jugador> jugadores = entityManager().
      createQuery("from Jugador", Jugador.class).
      getResultList();
  }
  
  
  
  
  
  
  
  

}
