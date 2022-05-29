package ar.argentinaprograma.portafolio.repository;

import java.util.Optional;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;

public interface IUsuarioRepository {
	
	UsuarioDto save(UsuarioDto dto);
	void deleteById(Long id);
	
	Optional<UsuarioDto> findByMail(String mail);
}
