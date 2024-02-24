package com.controller;

import com.controller.command.Command;
import com.controller.command.factory.FilmesCommandFactory;
import com.controller.command.operacao.OperacoesFilme;
import com.repository.FilmeRepository;

import java.util.Map;
import java.util.Optional;

public class FilmeController {

	private FilmeRepository filmesRepository;

	private FilmeController(FilmeRepository repository) {
		this.filmesRepository = repository;
	}

	private static FilmeController instance ;

	public static FilmeController getInstance(FilmeRepository repository){
		if(instance==null){
			instance = new FilmeController(repository);
		}
		return instance;
	}

	public void executar(OperacoesFilme operacao) {
		this.executar(operacao, null);
	}
	
	public void executar(OperacoesFilme operacao, Map<String, Object> params) {
		Optional<Command> command = FilmesCommandFactory.getInstance(filmesRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}
