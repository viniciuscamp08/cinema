package com.controller.command.impl.ator;

import com.model.ator.Ator;
import com.repository.AtorRepository;

import java.util.Map;

public class NovoAtor extends AtorCommand {
    public NovoAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Ator Ator = (Ator) params.get("ator");
        repository.inserir(Ator);
    }
}
