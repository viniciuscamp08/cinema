package com.controller.command.impl.diretor;

import com.controller.command.Command;
import com.repository.DiretorRepository;

import java.util.Map;

public abstract class DiretorCommand implements Command {

    protected DiretorRepository repository;

    protected DiretorCommand(DiretorRepository repository) {
        this.repository = repository;
    }

    @Override
    public abstract void executar(Map<String, Object> params);
}
