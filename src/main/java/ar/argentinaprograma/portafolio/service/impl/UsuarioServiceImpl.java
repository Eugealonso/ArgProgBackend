package ar.argentinaprograma.portafolio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;
import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import ar.argentinaprograma.portafolio.service.IUsuarioService;

@Component
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository repository;
	
	@Override
	public UsuarioDto login(String usuario, String pass) {
		UsuarioDto usuarioDto=repository.findByMail(usuario).get();
		if (usuarioDto.getPass().equals(pass)) return usuarioDto;
		else return null;
	}

}
