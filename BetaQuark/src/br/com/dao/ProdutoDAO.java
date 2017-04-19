package br.com.dao;

import br.com.entity.Produto;

public interface ProdutoDAO extends DAO<Produto, Integer> {

	void cadastrar(Produto produto);

}
