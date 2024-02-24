package com.app;


import com.controller.AtorController;
import com.controller.DiretorController;
import com.controller.FilmeController;
import com.controller.command.operacao.OperacoesAtor;
import com.controller.command.operacao.OperacoesDiretor;
import com.controller.command.operacao.OperacoesFilme;
import com.model.ator.Ator;
import com.model.ator.AtorBuilder;
import com.model.diretor.Diretor;
import com.model.diretor.DiretorBuilder;
import com.model.filme.Filme;
import com.model.filme.FilmeBuilder;
import com.repository.impl.AtorRepositoryInMemoryImpl;
import com.repository.impl.DiretorRepositoryInMemoryImpl;
import com.repository.impl.FilmeRepositoryInMemoryImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		//Builders filme
		Filme filme1 = new FilmeBuilder().comNome("Batman").comDescricao("Descricao Batman").build();
		Filme filme2 = new FilmeBuilder().comNome("Spiderman").comDescricao("Descricao Spiderman").build();
		
		//Builders ator
		Ator ator1 = new AtorBuilder().comNome("Joao").build();
		Ator ator2 = new AtorBuilder().comNome("Joaquim").build();
		
		//Builders diretor
		Diretor diretor1 = new DiretorBuilder().comNome("Maria").build();
		Diretor diretor2 = new DiretorBuilder().comNome("Ana").build();

		//Cria params
		Map<String, Object> params = new HashMap<>();
		
		//FilmeController
		FilmeController filmeController =  FilmeController.getInstance(FilmeRepositoryInMemoryImpl.getInstance());
		params.put("filme", filme1);
		filmeController.executar(OperacoesFilme.INSERIR, params);	
		params.put("filme", filme2);
		filmeController.executar(OperacoesFilme.INSERIR, params);
		
		//AtorController
		AtorController atorController = AtorController.getInstance(AtorRepositoryInMemoryImpl.getInstance());
		params.put("ator", ator1);
		atorController.executar(OperacoesAtor.INSERIR, params);
		params.put("ator", ator2);
		atorController.executar(OperacoesAtor.INSERIR, params);
		
		//DiretorController
		DiretorController diretorController = DiretorController.getInstance(DiretorRepositoryInMemoryImpl.getInstance());
		params.put("diretor", diretor1);
		diretorController.executar(OperacoesDiretor.INSERIR, params);
		params.put("diretor", diretor2);
		diretorController.executar(OperacoesDiretor.INSERIR, params);
			
		//Vincula o filme1 ao ator1
		params.put("idAtor", ator1.getId());
		params.put("filme", filme1);
		atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);

		//Vincula o diretor1 ao filme1
		params.put("idFilme", filme1.getId());
		params.put("diretor", diretor1);
		filmeController.executar(OperacoesFilme.ADICIONAR_DIRETOR, params);
		
		//Vincula o filme2 ao diretor2
		params.put("idDiretor", diretor2.getId());
		params.put("filme", filme2);
		diretorController.executar(OperacoesDiretor.ADICIONAR_FILME, params);
		
		//Vincula o filme2 ao ator2
		params.put("idAtor", ator2.getId());
		params.put("filme", filme2);
		atorController.executar(OperacoesAtor.ADICIONAR_FILME, params);

		//Print
		atorController.executar(OperacoesAtor.LISTAR_TODOS);
		diretorController.executar(OperacoesDiretor.LISTAR_TODOS);
		filmeController.executar(OperacoesFilme.LISTAR_TODOS);
		
		//Renomeia filme 1
		params.put("idFilme", filme1.getId());
		params.put("nome", "Star Wars");
		filmeController.executar(OperacoesFilme.RENOMEAR, params);
		
		//Atualiza descricao do filme1
		params.put("idFilme", filme1.getId());
		params.put("descricao", "Descricao Star Wars");
		filmeController.executar(OperacoesFilme.ATUALIZAR_DESCRICAO, params);
		
		//Pesquisa pelo novo nome do filme1
		params.put("keywords", "star");
		filmeController.executar(OperacoesFilme.PESQUISAR_POR_NOME, params);

	}

}
