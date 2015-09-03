package canchas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paleta {
	
	@Id
	@GeneratedValue
	private Long paletaId;
	
	private String nombre;
	
	private Integer grosor;
	
	@ManyToOne
	private Color color;
  
}
