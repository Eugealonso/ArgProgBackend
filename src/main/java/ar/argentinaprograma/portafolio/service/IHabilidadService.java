package ar.argentinaprograma.portafolio.service;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;

import java.util.List;

public interface IHabilidadService {
	
	HabilidadDto crearHabilidad(Long idUsuario, HabilidadDto dto);
	HabilidadDto editarHabilidad(HabilidadDto dto);
	void eliminarHabilidad(Long id);

	List<HabilidadDto> listarHabilidades(String tipo);
}
