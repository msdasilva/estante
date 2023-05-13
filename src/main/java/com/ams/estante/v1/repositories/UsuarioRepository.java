package com.ams.estante.v1.repositories;

import com.ams.estante.v1.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
