package com.repository;

import java.util.List;

import com.model.diretor.Diretor;
import com.model.filme.Filme;

public interface DiretorRepository {
	
	public Diretor inserir(Diretor entry);
	
	public Diretor renomear(int id, String nome);
	
	public void excluir(int id);
	
	public List<Diretor> listarTodos();
	
	public List<Diretor> pesquisarPorNome(String nomeOuParteDoNome);

	public Diretor adicionarFilme(int idDiretor, Filme filme);

	public Diretor removerFilme(int idDiretor, int idFilme);

}
