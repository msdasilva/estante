package com.ams.estante.v1.controllers;

import com.ams.estante.v1.DTO.UsuarioDTO;
import com.ams.estante.v1.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.findAll());
    }
}
