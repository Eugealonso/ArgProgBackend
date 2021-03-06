package ar.argentinaprograma.portafolio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.modelo.Habilidad;

@Mapper(componentModel = "spring")
public interface HabilidadDtoMapper {

	HabilidadDto toDto(Habilidad entity);

	Habilidad toEntity(HabilidadDto dto); 

}
