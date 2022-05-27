package ar.argentinaprograma.portafolio.dto;

import java.util.List;

import lombok.Data;

@Data
public class SeccionDto {

	private Long idSeccion;

	private String titulo;

	private UsuarioDto usuario;

	private List<ItemSeccionDto> items;

}
