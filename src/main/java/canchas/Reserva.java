package canchas;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reserva {
	
  @Id
  @GeneratedValue
  private Long reservaId;

  @OneToMany
  private Collection<Inscripcion> inscripciones;
  
  private Date fechaHoraInicio;
  
  private Date fechaHoraFin;
    
  @ManyToOne
  private Color color;

}
