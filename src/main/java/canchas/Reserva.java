package canchas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Reserva {

  @OneToMany
  private Collection<Inscripcion> inscripciones;

}
