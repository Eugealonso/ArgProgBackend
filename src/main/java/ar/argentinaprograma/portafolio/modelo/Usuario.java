package ar.argentinaprograma.portafolio.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="sq_usuario_gen")
	@SequenceGenerator(name="sq_usuario_gen", sequenceName = "sq_usuario", allocationSize = 1)
	@Column(name="id_usuario")
	private Long idUsuario;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="nombre_apellido")
	private String nombreApellido;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="foto_portada")
	private String fotoPortada;
	
	@Column(name="presentacion")
	private String presentacion;
	
	@Column(name="descripcion")
	private String descripcion;

	@Column(name = "url_linkedin")
	private String urlLinkedin;

	@Column(name = "url_github")
	private String urlGithub;
}
