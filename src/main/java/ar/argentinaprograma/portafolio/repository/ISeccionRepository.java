package ar.argentinaprograma.portafolio.repository;

import ar.argentinaprograma.portafolio.dto.SeccionDto;

import java.util.List;

public interface ISeccionRepository {
	
	SeccionDto save(SeccionDto dto);
	void deleteById(Long id);

	List<SeccionDto> findAll();
}
