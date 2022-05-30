package ar.argentinaprograma.portafolio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.modelo.Seccion;


@Mapper(componentModel = "spring", uses= {ItemSeccionDtoMapper.class})
public interface SeccionDtoMapper {

	SeccionDto toDto(Seccion entity);

	Seccion toEntity(SeccionDto dto); 

}
