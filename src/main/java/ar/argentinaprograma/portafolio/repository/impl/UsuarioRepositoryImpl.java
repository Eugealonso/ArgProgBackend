package ar.argentinaprograma.portafolio.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataUsuario;

@Component
public class UsuarioRepositoryImpl implements IUsuarioRepository {
	
	@Autowired
	private SpringDataUsuario repository;

}
