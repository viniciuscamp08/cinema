package com.controller.command.impl.filme;

import java.util.Map;

import com.repository.FilmeRepository;

public class RemoveDiretor extends FilmeCommand {
    public RemoveDiretor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        int idFilme = (int) params.get("idFilme");
        repository.removerDiretor(idFilme, idDiretor);
    }
}
