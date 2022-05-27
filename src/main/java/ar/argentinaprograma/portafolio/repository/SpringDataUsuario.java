package ar.argentinaprograma.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.argentinaprograma.portafolio.modelo.Usuario;

public interface SpringDataUsuario extends JpaRepository<Usuario, Long> {

}
