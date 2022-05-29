package ar.argentinaprograma.portafolio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.repository.ISeccionRepository;
import ar.argentinaprograma.portafolio.service.ISeccionService;

@Component
public class SeccionServiceImpl  implements ISeccionService{
	
	@Autowired
	private ISeccionRepository repository;

	@Override
	public SeccionDto crearSeccion(SeccionDto dto) {
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

}
