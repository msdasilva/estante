package com.ams.estante.v1.DTO;

import com.ams.estante.v1.entities.Usuario;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
}
