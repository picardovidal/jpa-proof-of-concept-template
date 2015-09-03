package canchas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Color {
	@Id
	@GeneratedValue
	private Long colorId;
	
	private String descripcion;
}
