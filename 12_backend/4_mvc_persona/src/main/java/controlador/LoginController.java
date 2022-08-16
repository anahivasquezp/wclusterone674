package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Persona;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("jsp/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona personaAutorizada = null;
		
		//1.- Obtener datos
		String nombre = request.getParameter("txtNombre");
		String clave = request.getParameter("txtClave");
		
		//2.- Hablar Modelo
		Persona personaModelo = new Persona();
		List<Persona> personas =  personaModelo.getPersonas();
		for (Persona persona : personas) {
			if(persona.getNombre().equals(nombre) && persona.getClave().equals(clave)) {
				personaAutorizada = persona;
				break;
			}
		}
		
		//3.- Hablo a la Vista o a otro Servlet
		if(personaAutorizada!=null) {
			request.getRequestDispatcher("ListarPersonaController").forward(request, response);
		}else {
			response.sendRedirect("jsp/login.jsp");
		}
		
	}

}
