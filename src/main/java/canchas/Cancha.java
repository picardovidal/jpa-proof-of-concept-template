package canchas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cancha {
	
  @Id
  @GeneratedValue
  @Column(name="CANCHA_ID")
  private Long CanchaId;
  
  private String nombre;
  
  private Boolean tieneIluminacion;
  
  @OneToMany
  private Collection<Reserva> reservas;
  
  @ManyToOne
  private Color color;

}
