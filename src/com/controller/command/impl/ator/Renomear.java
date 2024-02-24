package com.controller.command.impl.ator;

import java.util.Map;

import com.repository.AtorRepository;

public class Renomear extends AtorCommand {
    public Renomear(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        String nome = (String) params.get("nome");
        repository.renomear(idAtor, nome);
    }
}
