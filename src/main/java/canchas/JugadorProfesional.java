package canchas;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class JugadorProfesional extends Jugador {

  private int cantidadVictoriasEnTorneos;
  private int peso;
  private int altura;

}
