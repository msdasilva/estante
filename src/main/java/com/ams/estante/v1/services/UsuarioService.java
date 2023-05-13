package com.ams.estante.v1.services;

import com.ams.estante.v1.DTO.UsuarioDTO;
import com.ams.estante.v1.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioDTO> findAll() {
        return this.usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioDTO(usuario))
                .collect(Collectors.toList());
    }
}
