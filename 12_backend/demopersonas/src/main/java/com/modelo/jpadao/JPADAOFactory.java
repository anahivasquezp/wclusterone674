package com.modelo.jpadao;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.PersonaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public PersonaDAO getPersonaDAO() {

		return new JPAPersonaDAO();
	}

	
}
