package com.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity (name = "Personna")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name= "per_nombre")
	private String nombre;
	
	@Column (name= "per_clave")
	private String password;
	
	//Pequeña Base de datos
	//private static List<Persona> personas = null;
	
	
	public Persona() {
		
	}	

	public Persona(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" - "+this.nombre+" - "+this.password;
	}
	
	

}

