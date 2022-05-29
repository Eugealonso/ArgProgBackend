package ar.argentinaprograma.portafolio.repository;

import ar.argentinaprograma.portafolio.dto.SeccionDto;

public interface ISeccionRepository {
	
	SeccionDto save(SeccionDto dto);
	void deleteById(Long id);
}
