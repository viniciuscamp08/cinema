package com.controller.command.impl.filme;

import java.util.Map;

import com.repository.FilmeRepository;

public class PesquisarPorNome extends FilmeCommand {
    public PesquisarPorNome(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        String keywords = (String) params.get("keywords");
        repository.pesquisarPorNome(keywords).forEach(System.out::println);

    }
}
