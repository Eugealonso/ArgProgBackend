package ar.argentinaprograma.portafolio.repository.impl;

import ar.argentinaprograma.portafolio.filtros.HabilidadSpecification;
import ar.argentinaprograma.portafolio.modelo.Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.mapper.HabilidadDtoMapper;
import ar.argentinaprograma.portafolio.repository.IHabilidadRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataHabilidad;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabilidadRepositoryImpl implements IHabilidadRepository{
	
	@Autowired
	private SpringDataHabilidad repository;

	@Autowired
	private HabilidadDtoMapper mapper;

	@Autowired
	private HabilidadSpecification specification;
	
	@Override
	public HabilidadDto save(HabilidadDto dto) {
		return mapper.toDto(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<HabilidadDto> findAll(String tipo) {
		Specification<Habilidad> spec = specification.toSpec(tipo);
		return repository.findAll(spec).stream().map(mapper::toDto).collect(Collectors.toList());
	}

}
