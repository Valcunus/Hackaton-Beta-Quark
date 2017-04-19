package br.com.dao;

import java.util.List;

public interface DAO<T,K> {

	void insert(T entity) throws br.com.exceptions.DBCommitException;
	void update(T entity) throws br.com.exceptions.DBCommitException;
	void delete(K id) throws br.com.exceptions.DBCommitException, 
								br.com.exceptions.IdNotFoundException;
	T findById(K id);
	
	List<T> list();
	
}
