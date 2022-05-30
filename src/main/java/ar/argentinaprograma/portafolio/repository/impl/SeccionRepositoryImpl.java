package ar.argentinaprograma.portafolio.repository.impl;

import ar.argentinaprograma.portafolio.dto.ItemSeccionDto;
import ar.argentinaprograma.portafolio.modelo.ItemSeccion;
import ar.argentinaprograma.portafolio.modelo.Seccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.mapper.HabilidadDtoMapper;
import ar.argentinaprograma.portafolio.mapper.SeccionDtoMapper;
import ar.argentinaprograma.portafolio.repository.ISeccionRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataSeccion;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SeccionRepositoryImpl implements ISeccionRepository {
	
	@Autowired
	private SpringDataSeccion repository;
	
	@Autowired
	private SeccionDtoMapper mapper;
	
	@Override
	public SeccionDto save(SeccionDto dto) {
		Seccion seccion = mapper.toEntity(dto);
		if(seccion.getItems() != null)
			for(ItemSeccion itemSeccion: seccion.getItems()) {
				itemSeccion.setSeccion(seccion);
			}
		return mapper.toDto(repository.save(seccion));
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<SeccionDto> findAll() {
		return repository.findAllByOrderByIdSeccionAsc().stream().map(mapper::toDto).collect(Collectors.toList());
	}

}
