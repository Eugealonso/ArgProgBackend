package ar.argentinaprograma.portafolio.modelo;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="seccion")
public class Seccion {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sq_seccion_gen")
	@SequenceGenerator(name="sq_seccion_gen", sequenceName = "sq_seccion", allocationSize = 1)
	@Column(name="id_seccion")
	private Long idSeccion;
	
	@Column(name="titulo")
	private String titulo;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "seccion", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("idItemSeccion ASC")
	private List<ItemSeccion> items;

}
