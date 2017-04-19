package br.com.dao.impl;

import java.util.List;

import br.com.dao.DAO;
import br.com.entity.Produto;
import br.com.exceptions.DBCommitException;
import br.com.exceptions.IdNotFoundException;

public class DAOImpl implements DAO<Produto, Integer>{

	@Override
	public void insert(Produto entity) throws DBCommitException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Produto entity) throws DBCommitException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws DBCommitException, IdNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> list() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
