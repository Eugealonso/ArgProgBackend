package ar.argentinaprograma.portafolio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ar.argentinaprograma.portafolio.dto.ItemSeccionDto;
import ar.argentinaprograma.portafolio.modelo.ItemSeccion;


@Mapper(componentModel = "spring")
public interface ItemSeccionDtoMapper {
	
	@Mapping(target="seccion", ignore=true)
	ItemSeccionDto toDto(ItemSeccion entity);
	
	@Mapping(target="seccion", ignore=true)
	ItemSeccion toEntity(ItemSeccionDto dto); 
}
