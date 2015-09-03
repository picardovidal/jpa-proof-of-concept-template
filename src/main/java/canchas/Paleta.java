package canchas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Paleta {
	
	private String nombre;
	
	private Integer grosor;
	
	@ManyToOne
	private Color color;
  
}
