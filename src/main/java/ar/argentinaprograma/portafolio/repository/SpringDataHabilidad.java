package ar.argentinaprograma.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.argentinaprograma.portafolio.modelo.Habilidad;

public interface SpringDataHabilidad extends JpaRepository<Habilidad, Long> {

}
