package com.modelo.jpadao;

import javax.persistence.EntityManager;

import com.modelo.entidades.Persona;
import com.modelo.dao.GenericDAO;

public class JPAGenericDAO<T,Integer> implements GenericDAO<T, Integer>{


	@Override
	public void create(T instancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T instancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T instancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



}
