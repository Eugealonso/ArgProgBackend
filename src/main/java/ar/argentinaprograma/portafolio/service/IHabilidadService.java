package ar.argentinaprograma.portafolio.service;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;

public interface IHabilidadService {
	
	HabilidadDto crearHabilidad(HabilidadDto dto);
	HabilidadDto editarHabilidad(HabilidadDto dto);
	void eliminarHabilidad(Long id);
}
