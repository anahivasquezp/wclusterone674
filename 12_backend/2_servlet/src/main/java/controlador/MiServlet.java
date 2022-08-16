package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class MiServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init() throws ServletException {
		//super.init();
		System.out.println("Pasa por el INIT");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Pasa por el GET (SERVICE)");
		String nombre = request.getParameter("txtNombre");
		String clave = request.getParameter("txtClave");
		
		//Producir el HTML
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1> Hola " + nombre + "</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Pasa por el POST (SERVICE)");
	}

	@Override
	public void destroy() {
		//super.destroy();
		System.out.println("Pasa por DESTROY)");
	}


	
	

}
