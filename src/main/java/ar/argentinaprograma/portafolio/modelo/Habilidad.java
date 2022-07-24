package ar.argentinaprograma.portafolio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="habilidad")
public class Habilidad {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sq_habilidad_gen")
	@SequenceGenerator(name="sq_habilidad_gen", sequenceName = "sq_habilidad", allocationSize = 1)
	@Column(name="id_habilidad")
	private Long idHabilidad;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="porcentaje")
	private Integer porcentaje;
	
	@Column(name="tipo")
	@Enumerated(EnumType.STRING)
	private TipoHabilidad tipo;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

}
