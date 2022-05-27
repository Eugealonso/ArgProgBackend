package ar.argentinaprograma.portafolio.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.repository.IHabilidadRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataHabilidad;

@Component
public class HabilidadRepositoryImpl implements IHabilidadRepository{
	
	@Autowired
	private SpringDataHabilidad repository;

}
