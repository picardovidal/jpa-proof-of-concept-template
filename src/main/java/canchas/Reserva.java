package canchas;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateTimeConverter;

@Entity
public class Reserva {

  @Id
  @GeneratedValue
  private Long reservaId;

  @OneToMany
  private Collection<Inscripcion> inscripciones;

  @Convert(converter=LocalDateTimeConverter.class)
  private LocalDateTime fechaHoraInicio;

  @Convert(converter=LocalDateTimeConverter.class)
  private LocalDateTime fechaHoraFin;

  @ManyToOne
  private Color colorCancha;

  public Reserva(Collection<Inscripcion> inscripciones,
      LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Color colorCancha) {
    this.inscripciones = inscripciones;
    this.fechaHoraInicio = fechaHoraInicio;
    this.fechaHoraFin = fechaHoraFin;
    this.colorCancha = colorCancha;
  }


}
