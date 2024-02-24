package com.controller.command.impl.diretor;

import com.model.filme.Filme;
import com.repository.DiretorRepository;

import java.util.Map;

public class AdicionarFilme extends DiretorCommand {
    public AdicionarFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        Integer idDiretor = (Integer) params.get("idDiretor");
        Filme filme = (Filme) params.get("filme");
        repository.adicionarFilme(idDiretor, filme);
    }
}
