package ar.argentinaprograma.portafolio.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.mapper.HabilidadDtoMapper;
import ar.argentinaprograma.portafolio.repository.IHabilidadRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataHabilidad;

@Component
public class HabilidadRepositoryImpl implements IHabilidadRepository{
	
	@Autowired
	private SpringDataHabilidad repository;

	@Autowired
	private HabilidadDtoMapper mapper;
	
	@Override
	public HabilidadDto save(HabilidadDto dto) {
		return mapper.toDto(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
