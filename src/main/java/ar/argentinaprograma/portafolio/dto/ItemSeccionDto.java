package ar.argentinaprograma.portafolio.dto;

import lombok.Data;

@Data
public class ItemSeccionDto {

	private Long idItemSeccion;
	
	private String titulo;

	private String descripcion;

	private SeccionDto seccion;

}
