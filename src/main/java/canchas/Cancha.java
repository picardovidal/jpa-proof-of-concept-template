package canchas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
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
	@Column(name = "CANCHA_ID")
	private Long canchaId;

	private String nombre;

	private Boolean tieneIluminacion;

	@OneToMany
	private Collection<Reserva> reservas;

	@ManyToOne
	private Color color;
	
	public Cancha(){
		super();
	}

	public Cancha(String nombre) {
		this.nombre = nombre;
	}

	public Cancha(String nombre, Color color) {
		this.nombre = nombre;
		this.setColor(color);
	}

	public Long getCanchaId() {
		return canchaId;
	}

	public void setCanchaId(Long canchaId) {
		this.canchaId = canchaId;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

  public void reservar(LocalDateTime inicioReserva, Collection<Jugador> jugadores) {
    reservas.add(new ReservaBuilder()
      .inicioReserva(inicioReserva)
      .jugadores(jugadores)
      .cancha(this)
      .build());
  }
}
