package ar.argentinaprograma.portafolio.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.argentinaprograma.portafolio.repository.ISeccionRepository;
import ar.argentinaprograma.portafolio.repository.SpringDataSeccion;

@Component
public class SeccionRepositoryImpl implements ISeccionRepository {
	
	@Autowired
	private SpringDataSeccion repository;

}
