package com.controller.command.impl.diretor;

import java.util.Map;

import com.repository.DiretorRepository;

public class RemoveFilme extends DiretorCommand {
    public RemoveFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        int idFilme = (int) params.get("idFilme");
        repository.removerFilme(idDiretor, idFilme);
    }
}
