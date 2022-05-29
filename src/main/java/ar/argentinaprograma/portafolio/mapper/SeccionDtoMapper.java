package ar.argentinaprograma.portafolio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.modelo.Seccion;


@Mapper(componentModel = "spring", uses= {ItemSeccionDtoMapper.class})
public interface SeccionDtoMapper {
	
	@Mapping(target="usuario", ignore=true)
	SeccionDto toDto(Seccion entity);
	
	@Mapping(target="usuario", ignore=true)
	Seccion toEntity(SeccionDto dto); 

}
