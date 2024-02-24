package com.controller.command.impl.filme;

import com.model.filme.Filme;
import com.repository.FilmeRepository;

import java.util.Map;

public class NovoFilme extends FilmeCommand {
    public NovoFilme(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Filme filme = (Filme) params.get("filme");
        repository.inserir(filme);
    }
}
