package canchas;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Jugador {

  @OneToOne
  private Paleta paleta;
  
}
