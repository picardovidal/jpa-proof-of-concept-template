package canchas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cancha {
  
  @OneToMany
  private Collection<Reserva> reservas;

}
