package com.controller.command.impl.ator;

import java.util.Map;

import com.repository.AtorRepository;

public class ExcluirAtor extends AtorCommand {
    public ExcluirAtor(AtorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idAtor = (int) params.get("idAtor");
        repository.excluir(idAtor);
    }
}
