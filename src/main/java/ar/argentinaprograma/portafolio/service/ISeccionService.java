package ar.argentinaprograma.portafolio.service;

import ar.argentinaprograma.portafolio.dto.SeccionDto;

public interface ISeccionService {
	
	SeccionDto crearSeccion(SeccionDto dto);
	SeccionDto editarSeccion(SeccionDto dto);
	void eliminarSeccion(Long id);
}
