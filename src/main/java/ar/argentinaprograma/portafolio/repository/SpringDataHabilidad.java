package ar.argentinaprograma.portafolio.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.argentinaprograma.portafolio.modelo.Habilidad;

import java.util.List;

public interface SpringDataHabilidad extends JpaRepository<Habilidad, Long> {

    List<Habilidad> findAll(Specification<Habilidad> specification);
}
