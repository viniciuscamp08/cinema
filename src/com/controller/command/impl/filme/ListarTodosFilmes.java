package com.controller.command.impl.filme;

import java.util.Map;

import com.repository.FilmeRepository;

public class ListarTodosFilmes extends FilmeCommand {


    public ListarTodosFilmes(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
