package com.controller.command.impl.ator;

import com.controller.command.Command;
import com.repository.AtorRepository;

import java.util.Map;

public abstract class AtorCommand implements Command {

    protected AtorRepository repository;

    protected AtorCommand(AtorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
