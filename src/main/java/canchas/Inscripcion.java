package canchas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Inscripcion {
  
  @ManyToOne
  private Paleta paleta;
  
  @ManyToOne
  private Jugador jugador;

}
