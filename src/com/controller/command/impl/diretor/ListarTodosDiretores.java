package com.controller.command.impl.diretor;

import java.util.Map;

import com.repository.DiretorRepository;

public class ListarTodosDiretores extends DiretorCommand {


    public ListarTodosDiretores(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        repository.listarTodos().forEach((System.out::println));
    }
}
