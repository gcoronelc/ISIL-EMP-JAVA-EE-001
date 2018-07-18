package pe.gob.sunarp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.gob.sunarp.adm.service.LOGINService;

@WebServlet({ "/LOGINController", "/Login" })
public class LOGINController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");

		// Proceso
		LOGINService service = new LOGINService();
		List<Map<String, ?>> lista = service.login(usuario, clave);
		System.err.println("CODE: " + service.getCode());
		System.err.println("MENSAJE: " + service.getMensaje());
		System.err.println("Cantidad de lista: " + lista.size());
		//service.setCode(1);/////////////////////////////////////////DESCOMENTAR ARRIBA Y COMENTAR ESTA 
		// Forward
		// request.setAttribute("lista", lista);
		// RequestDispatcher rd =
		// request.getRequestDispatcher("ListEmpleados.jsp");
		// rd.forward(request, response);

		RequestDispatcher rd;
		if (service.getCode() == 1) {
			rd = request.getRequestDispatcher("Views/EMPLEADO/ListEmpleados.jsp");
			// rd1.forward(request, response);
		} else {
			request.setAttribute("mensaje", service.getMensaje());
			rd = request.getRequestDispatcher("index.jsp");
		}
		rd.forward(request, response);

	}

}
