package com.controller.command.impl.diretor;

import com.model.diretor.Diretor;
import com.repository.DiretorRepository;

import java.util.Map;

public class NovoDiretor extends DiretorCommand {
    public NovoDiretor(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Diretor diretor = (Diretor) params.get("diretor");
        repository.inserir(diretor);
    }
}
