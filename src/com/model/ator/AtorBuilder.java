package com.model.ator;

import java.time.LocalDate;
import java.util.List;

import com.model.filme.Filme;

public class AtorBuilder {

	private Ator ator = new Ator();

	public AtorBuilder comNome(String nome){
		ator.setNome(nome);
		return this;
	}

	public AtorBuilder comDataNascimento(LocalDate dataNascimento){
		ator.setDataNascimento(dataNascimento);
		return this;
	}

	public AtorBuilder comFilmes(List<Filme> filmes){
		ator.setFilmes(filmes);
		return this;
	}

	public Ator build(){
		return ator;
	}

}
