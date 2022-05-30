package ar.argentinaprograma.portafolio.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.dto.UsuarioDto;
import ar.argentinaprograma.portafolio.mapper.UsuarioDtoMapper;
import ar.argentinaprograma.portafolio.repository.IUsuarioRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataUsuario;

@Component
public class UsuarioRepositoryImpl implements IUsuarioRepository {
	
	@Autowired
	private SpringDataUsuario repository;
	
	@Autowired
	private UsuarioDtoMapper mapper;
	
	@Override
	public UsuarioDto save(UsuarioDto dto) {
		return mapper.toDto(repository.save(mapper.toEntity(dto)));
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<UsuarioDto> findByMail(String mail) {
		return repository.findByMail(mail).map(mapper::toDto);
	}

	@Override
	public Optional<UsuarioDto> findById(Long id) {
		return repository.findById(id).map(mapper::toDto);
	}

}
