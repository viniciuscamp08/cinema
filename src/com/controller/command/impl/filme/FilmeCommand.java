package com.controller.command.impl.filme;

import com.controller.command.Command;
import com.repository.FilmeRepository;

import java.util.Map;

 abstract class FilmeCommand implements Command {

    protected FilmeRepository repository;

    protected FilmeCommand(FilmeRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
