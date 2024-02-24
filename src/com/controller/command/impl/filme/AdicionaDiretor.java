package com.controller.command.impl.filme;

import com.model.diretor.Diretor;
import com.repository.FilmeRepository;

import java.util.Map;

public class AdicionaDiretor extends FilmeCommand {
    public AdicionaDiretor(FilmeRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {

        int idFilme = (int) params.get("idFilme");
        Diretor diretor = (Diretor) params.get("diretor");
        repository.adicionarDiretor(idFilme, diretor);

    }
}
