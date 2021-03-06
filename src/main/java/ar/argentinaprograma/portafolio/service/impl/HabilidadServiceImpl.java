package ar.argentinaprograma.portafolio.service.impl;

import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.repository.IHabilidadRepository;
import ar.argentinaprograma.portafolio.service.IHabilidadService;

import java.util.List;

@Component
public class HabilidadServiceImpl  implements IHabilidadService {
	
	@Autowired
	private IHabilidadRepository repository;

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public HabilidadDto crearHabilidad(Long idUsuario, HabilidadDto dto) {
		dto.setUsuario(usuarioRepository.findById(idUsuario).orElse(null));
		return repository.save(dto);
	}

	@Override
	public HabilidadDto editarHabilidad(HabilidadDto dto) {
		return repository.save(dto);
	}

	@Override
	public void eliminarHabilidad(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<HabilidadDto> listarHabilidades(String tipo) {
		return repository.findAll(tipo);
	}

}
