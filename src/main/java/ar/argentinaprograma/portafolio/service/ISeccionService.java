package ar.argentinaprograma.portafolio.service;

import ar.argentinaprograma.portafolio.dto.SeccionDto;

import java.util.List;

public interface ISeccionService {
	
	SeccionDto crearSeccion(Long idUsuario, SeccionDto dto);
	SeccionDto editarSeccion(SeccionDto dto);
	void eliminarSeccion(Long id);

	List<SeccionDto> listarSecciones();
}
