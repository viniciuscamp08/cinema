package com.controller.command.impl.ator;

import com.model.filme.Filme;
import com.repository.AtorRepository;

import java.util.Map;

public class AdicionarFilme extends AtorCommand {
    public AdicionarFilme(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idAtor = (Integer) params.get("idAtor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idAtor, filme);
    }
}
