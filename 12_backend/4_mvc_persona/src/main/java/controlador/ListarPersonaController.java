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
 * Servlet implementation class ListarPersonaController
 */
@WebServlet("/ListarPersonaController")
public class ListarPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarPersonaController() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.- obtener parametros
		//2.- Hablo con el Modelo
		Persona personaModelo = new Persona();
		List<Persona> personas = personaModelo.getPersonas();
		//3.- Hablo con la vista o un Servlet
		request.setAttribute("personitas", personas);
		request.getRequestDispatcher("jsp/listarPersona.jsp").forward(request, response);
		
	}

}
