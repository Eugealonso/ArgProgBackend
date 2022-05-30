package ar.argentinaprograma.portafolio.repository;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;

import java.util.List;

public interface IHabilidadRepository {
	
	HabilidadDto save(HabilidadDto dto);
	void deleteById(Long id);

	List<HabilidadDto> findAll(String tipo);

}
