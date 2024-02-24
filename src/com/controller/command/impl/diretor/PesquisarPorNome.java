package com.controller.command.impl.diretor;

import java.util.Map;

import com.repository.DiretorRepository;

public class PesquisarPorNome extends DiretorCommand {
    public PesquisarPorNome(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        String keywords = (String) params.get("keywords");
        repository.pesquisarPorNome(keywords).forEach(System.out::println);

    }
}
