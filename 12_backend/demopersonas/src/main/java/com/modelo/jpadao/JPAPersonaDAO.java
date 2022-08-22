package com.modelo.jpadao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;
import modelo.conexion.ConexionBDD;
import modelo.dao.PersonaDAO;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO {

	
	public JPAPersonaDAO() {
		super(com.modelo.entidades.Persona.class);
	}
	
	@Override
	public Persona autorizar(String usuario, String password) {
		Persona personaAutorizada = null;

		String sql = "SELECT * FROM persona WHERE nombre = ? AND password = ?";
		ResultSet rs = null;
		PreparedStatement pstm = null;

		try {
			pstm = ConexionBDD.getConexion().prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, password);

			rs = pstm.executeQuery();

			while (rs.next()) {
				personaAutorizada = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return personaAutorizada;
	}

	@Override
	public List<Persona> getPersonas() {
		// 1.- Declarar variables y SQL
		String sql = "SELECT * FROM PERSONA";
		Connection cnn = null;
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<Persona>();

		// 2.- COnectar a la BDD
		cnn = ConexionBDD.getConexion();
		try {
			rs = cnn.prepareStatement(sql).executeQuery();

			while (rs.next()) {
				Persona p = new Persona(rs.getInt(1), rs.getString(2), rs.getString(3));
				personas.add(p);
				System.out.println(p);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 3.- Cerrar
			ConexionBDD.cerrar(rs);
		}

		return personas;
	}

	@Override
	public boolean create(Persona p) {
		boolean bandera = false;

		String sql = "INSERT INTO persona (nombre, password) VALUES (?,?)";
		PreparedStatement pstm = null;

		try {
			pstm = ConexionBDD.getConexion().prepareStatement(sql);
			pstm.setString(1, p.getNombre());
			pstm.setString(2, p.getPassword());
			int filas = pstm.executeUpdate();
			System.out.println("Número de filas ejecutadas: " + filas);
			bandera = true;

		} catch (SQLException e) {
			e.printStackTrace();
			ConexionBDD.cerrar(pstm);
		}
		
		return bandera;

	}

	@Override
	public boolean update(Persona p) {
		boolean respuesta = false;

		String sql = "UPDATE PERSONA SET nombre = ? , password = ? WHERE id = ?";
		PreparedStatement pstm = null;

		try {
			pstm = ConexionBDD.getConexion().prepareStatement(sql);
			pstm.setString(1, p.getNombre());
			pstm.setString(2, p.getPassword());
			pstm.setInt(3, p.getId());

			int filas = pstm.executeUpdate();
			System.out.println("Número de filas ejecutadas: " + filas);
			respuesta = true;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			ConexionBDD.cerrar(pstm);
		}

		return respuesta;

	}

	@Override
	public boolean delete (int idPersona) {
		boolean respuesta = false;

		// Variables

		String sql = "DELETE FROM persona WHERE id = ?";
		PreparedStatement pstm = null;

		// COnectar BDD
		try {
			pstm = ConexionBDD.getConexion().prepareStatement(sql);
			pstm.setInt(1, idPersona);
			int filas = pstm.executeUpdate();
			System.out.println("Número de filas ejecutadas: " + filas);
			respuesta = true;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			ConexionBDD.cerrar(pstm);
		}

		return respuesta;

	}

	@Override
	public Persona getById(int idPersona) {
		// Variables
		String sql = "SELECT * FROM PERSONA WHERE id = ?";
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Persona persona = null;

		// Conexion BDD
		try {
			pstm = ConexionBDD.getConexion().prepareStatement(sql);
			pstm.setInt(1, idPersona);
			rs = pstm.executeQuery();

			while (rs.next()) {
				persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("password"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			ConexionBDD.cerrar(pstm);
			ConexionBDD.cerrar(rs);
		}
		return persona;

	}

}
