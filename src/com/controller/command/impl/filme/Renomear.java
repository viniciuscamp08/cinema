package com.controller.command.impl.filme;

import java.util.Map;

import com.repository.FilmeRepository;

public class Renomear extends FilmeCommand {
    public Renomear(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idFilme = (int) params.get("idFilme");
        String nome = (String) params.get("nome");
        repository.renomear(idFilme, nome);
    }
}
