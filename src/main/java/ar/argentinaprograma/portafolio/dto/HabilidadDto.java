package ar.argentinaprograma.portafolio.dto;


import ar.argentinaprograma.portafolio.modelo.TipoHabilidad;
import lombok.Data;

@Data
public class HabilidadDto {

	private Long idHabilidad;

	private String titulo;

	private Integer porcentaje;

	private TipoHabilidad tipo;

	private UsuarioDto usuario;


}
