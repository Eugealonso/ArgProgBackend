package ar.argentinaprograma.portafolio.dto;

import lombok.Data;

@Data
public class UsuarioDto {
	
	private Long idUsuario;
	
	private String mail;
	
	private String pass;

	private String nombreApellido;

	private String foto;

	private String fotoPortada;

	private String presentacion;

	private String descripcion;

	private String urlLinkedin;

	private String urlGithub;
}
