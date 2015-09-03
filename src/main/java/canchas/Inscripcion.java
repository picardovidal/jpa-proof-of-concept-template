package canchas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inscripcion {
	
  @Id
  @GeneratedValue
  private Long inscripcionId;
  
  @ManyToOne
  private Paleta paleta;
  
  @ManyToOne
  private Jugador jugador;

}
