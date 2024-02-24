package com.controller;

import java.util.Map;
import java.util.Optional;

import com.controller.command.Command;
import com.controller.command.factory.AtoresCommandFactory;
import com.controller.command.operacao.OperacoesAtor;
import com.repository.AtorRepository;

public class AtorController {

	private AtorRepository atoresRepository;

	private AtorController(AtorRepository repository) {
		this.atoresRepository = repository;
	}

	private static AtorController instance ;

	public static AtorController getInstance(AtorRepository repository){
		if(instance==null){
			instance = new AtorController(repository);
		}
		return instance;
	}

	public void executar(OperacoesAtor operacao) {
		this.executar(operacao, null);
	}
	
	public void executar(OperacoesAtor operacao, Map<String, Object> params) {
		Optional<Command> command = AtoresCommandFactory.getInstance(atoresRepository).getCommand(operacao);
		if(command.isPresent()){
			command.get().executar(params);
		}
		else{
			System.out.println("Comando nao encontrado para a opcao " + operacao);
		}

	}

}
