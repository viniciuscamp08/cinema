package com.controller.command.impl.diretor;

import java.util.Map;

import com.repository.DiretorRepository;

public class Renomear extends DiretorCommand {
    public Renomear(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        String nome = (String) params.get("nome");
        repository.renomear(idDiretor, nome);
    }
}
