package com.ams.estante.v1.entities;

import java.util.List;

public class Colecoes {

    private Long id;

    private List<Usuario> usuarios;

    private String nome;

    public Colecoes(Long id, List<Usuario> usuarios, String nome) {
        this.id = id;
        this.usuarios = usuarios;
        this.nome = nome;
    }
}
