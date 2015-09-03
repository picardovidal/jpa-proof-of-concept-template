package canchas;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reserva {

  @OneToMany
  private Collection<Inscripcion> inscripciones;
  
  private LocalDateTime fechaHoraInicio;
  
  private LocalDateTime fechaHoraFin;
    
  @ManyToOne
  private Color color;

}
