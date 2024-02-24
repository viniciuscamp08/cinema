package com.controller.command.impl.filme;

import java.util.Map;

import com.repository.FilmeRepository;

public class AtualizarDescricao extends FilmeCommand {
    public AtualizarDescricao(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idFilme = (int) params.get("idFilme");
        String descricao = (String) params.get("descricao");
        repository.atualizarDescricao(idFilme, descricao);

    }
}
