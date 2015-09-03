package canchas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Jugador {
	
  private String nombre;
  
  private String apellido;
  
  private String domicilio;
  
  private String telefono;
  
  private Date fechaNacimiento;

  @OneToOne
  private Paleta paleta;
  
}
