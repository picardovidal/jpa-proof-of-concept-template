package canchas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Jugador {
	
  @Id
  @GeneratedValue
  private Long jugadorId;
	
  private String nombre;
  
  private String apellido;
  
  private String domicilio;
  
  private String telefono;
  
  private Date fechaNacimiento;

  @OneToOne
  private Paleta paleta;

  public Inscripcion crearInscripcion() {
    return new Inscripcion(this, this.paleta);
  }
  
}
