package canchas;

import static javax.persistence.InheritanceType.JOINED;
import static javax.persistence.InheritanceType.SINGLE_TABLE;
import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorColumn(name="tipo_jugador")
@Inheritance(strategy=JOINED)
public abstract class Jugador {
	
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

  public void setPaleta(Paleta paletaB) {
    this.paleta = paleta;
  }
  
}
