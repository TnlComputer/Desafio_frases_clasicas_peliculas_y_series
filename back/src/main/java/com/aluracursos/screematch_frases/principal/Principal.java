package com.aluracursos.screematch_frases.principal;

import com.aluracursos.screematch_frases.repository.FrasesRepository;

public class Principal {
    private FrasesRepository repositorio;

    public Principal(FrasesRepository repository) {
        this.repositorio = repository;
    }
}