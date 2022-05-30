package ar.argentinaprograma.portafolio.service.impl;

import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import ar.argentinaprograma.portafolio.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.repository.ISeccionRepository;
import ar.argentinaprograma.portafolio.service.ISeccionService;

import java.util.List;

@Component
public class SeccionServiceImpl  implements ISeccionService{
	
	@Autowired
	private ISeccionRepository repository;

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public SeccionDto crearSeccion(Long idUsuario, SeccionDto dto) {
		dto.setUsuario(usuarioRepository.findById(idUsuario).orElse(null));
		return repository.save(dto);
	}

	@Override
	public SeccionDto editarSeccion(SeccionDto dto) {
		return repository.save(dto);
	}

	@Override
	public void eliminarSeccion(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<SeccionDto> listarSecciones() {
		return repository.findAll();
	}

}
