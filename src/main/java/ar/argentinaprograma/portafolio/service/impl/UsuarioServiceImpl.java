package ar.argentinaprograma.portafolio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;
import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import ar.argentinaprograma.portafolio.service.IUsuarioService;

import java.util.Optional;

@Component
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository repository;
	
	@Override
	public UsuarioDto login(String usuario, String pass) {
		Optional<UsuarioDto> usuarioDto=repository.findByMail(usuario);
		return usuarioDto.orElse(null);
	}

	@Override
	public UsuarioDto editarUsuario(Long idUsuario, UsuarioDto usuarioDto) {
		return repository.save(usuarioDto);
	}

}
