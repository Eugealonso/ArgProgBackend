package ar.argentinaprograma.portafolio.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.mapper.HabilidadDtoMapper;
import ar.argentinaprograma.portafolio.mapper.SeccionDtoMapper;
import ar.argentinaprograma.portafolio.repository.ISeccionRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataSeccion;

@Component
public class SeccionRepositoryImpl implements ISeccionRepository {
	
	@Autowired
	private SpringDataSeccion repository;
	
	@Autowired
	private SeccionDtoMapper mapper;
	
	@Override
	public SeccionDto save(SeccionDto dto) {
		return mapper.toDto(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
