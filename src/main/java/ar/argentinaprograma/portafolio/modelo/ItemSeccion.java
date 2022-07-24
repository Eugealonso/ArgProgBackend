package ar.argentinaprograma.portafolio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="item_seccion", schema = "portafolio")
public class ItemSeccion {

		@Id
		@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sq_item_seccion_gen")
		@SequenceGenerator(name="sq_item_seccion_gen", sequenceName = "sq_item_seccion", allocationSize = 1)
		@Column(name="id_item_seccion")
		private Long idItemSeccion;
		
		@Column(name="titulo")
		private String titulo;
		
		@Column(name="descripcion")
		private String descripcion;
		
		@ManyToOne
		@JoinColumn(name="id_seccion")
		private Seccion seccion;


}
