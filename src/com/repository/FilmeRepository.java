package com.repository;

import java.util.List;

import com.model.ator.Ator;
import com.model.diretor.Diretor;
import com.model.filme.Filme;

public interface FilmeRepository {
	
	public Filme inserir(Filme filme);
	
	public Filme renomear(int id, String nome);
	
	public void excluir(int id);
	
	public List<Filme> listarTodos();
	
	public List<Filme> pesquisarPorNome(String nomeOuParteDoNome);

	public Filme atualizarDescricao(int id, String descricao);

	public Filme adicionarAtor(int idFilme, Ator ator);

	public Filme removerAtor(int idFilme, int idAtor);

	public Filme adicionarDiretor(int idFilme, Diretor diretor);

	public Filme removerDiretor(int idFilme, int idDiretor);

}