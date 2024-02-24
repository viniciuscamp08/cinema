package com.controller.command.impl.filme;

import com.model.ator.Ator;
import com.repository.FilmeRepository;

import java.util.Map;

public class AdicionarAtor extends FilmeCommand {
    public AdicionarAtor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idFilme = (Integer) params.get("idFilme");
        Ator ator = (Ator) params.get("ator");
        repository.adicionarAtor(idFilme, ator);
    }
}
