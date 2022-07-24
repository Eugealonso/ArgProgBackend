package ar.argentinaprograma.portafolio.service;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;

public interface IUsuarioService {
	
	UsuarioDto login (String usuario, String pass);

	UsuarioDto editarUsuario(Long idUsuario, UsuarioDto usuarioDto);

	UsuarioDto obtenerUsuario(Long idUsuario);
}
