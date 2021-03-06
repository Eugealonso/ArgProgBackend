package ar.argentinaprograma.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.argentinaprograma.portafolio.modelo.Seccion;

import java.util.List;

public interface SpringDataSeccion extends JpaRepository<Seccion, Long>{

    List<Seccion> findAllByOrderByIdSeccionAsc();
}
