package com.modelo.dao;

import com.modelo.jdbcdao.JDBCDAOFactory;
import com.modelo.jpadao.JPADAOFactory;

public abstract class DAOFactory {
	//protected static DAOFactory instancia = new JDBCDAOFactory();
	protected static DAOFactory instancia = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return instancia;
	}
	
	public abstract PersonaDAO getPersonaDAO();
	public abstract DepartamentoDAO getDepartamentoDAO();

}
