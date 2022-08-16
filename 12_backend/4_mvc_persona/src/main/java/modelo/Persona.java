package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String clave;
	
	//Mi peque�a Base de Datos
	static List<Persona> personas=null;
	
	public Persona(){
		
	}
	

	public Persona(int id, String nombre, String clave) {

		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
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
	

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<Persona> getPersonas(){
		if(personas == null || personas.size()==0) {
			personas = new ArrayList<Persona>();
			personas.add(new Persona(1,"Carlos", "carlos123"));
			personas.add(new Persona(2,"Bob", "esponja123"));
			personas.add(new Persona(3,"Patricio", "pato123"));
		}
		return personas;
	}
	@Override
	public String toString() {
		return "Hola soy "+ this.nombre;
	}
	
	
	

}
