package ar.argentinaprograma.portafolio.mapper;

import org.mapstruct.Mapper;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;
import ar.argentinaprograma.portafolio.modelo.Usuario;


@Mapper(componentModel ="spring", uses = {SeccionDtoMapper.class, HabilidadDtoMapper.class})
public interface UsuarioDtoMapper {

	UsuarioDto toDto(Usuario entity);
	
	Usuario toEntity(UsuarioDto dto); 

}
