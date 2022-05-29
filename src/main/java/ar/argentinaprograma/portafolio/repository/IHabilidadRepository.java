package ar.argentinaprograma.portafolio.repository;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;

public interface IHabilidadRepository {
	
	HabilidadDto save(HabilidadDto dto);
	void deleteById(Long id);

}
