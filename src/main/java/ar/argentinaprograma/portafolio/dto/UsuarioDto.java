package ar.argentinaprograma.portafolio.dto;

import java.util.List;

import ar.argentinaprograma.portafolio.modelo.Habilidad;
import ar.argentinaprograma.portafolio.modelo.Seccion;
import lombok.Data;

@Data
public class UsuarioDto {
	
	private Long idUsuario;
	
	private String mail;
	
	private String pass;

	private String nombreApellido;

	private byte[] foto;

	private byte[] fotoPortada;

	private String presentacion;

	private String descripcion;

	private List<SeccionDto> secciones;

	private List<HabilidadDto> habilidades;
}
