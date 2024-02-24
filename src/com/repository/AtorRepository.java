package com.repository;

import java.util.List;

import com.model.ator.Ator;
import com.model.filme.Filme;

public interface AtorRepository{
	
	public Ator inserir(Ator ator);
	
	public Ator renomear(int id, String nome);
	
	public void excluir(int id);
	
	public List<Ator> listarTodos();
	
	public List<Ator> pesquisarPorNome(String nomeOuParteDoNome);

	public Ator adicionarFilme(int idAtor, Filme filme);

	public Ator removerFilme(int idAtor, int idFilme);

}
