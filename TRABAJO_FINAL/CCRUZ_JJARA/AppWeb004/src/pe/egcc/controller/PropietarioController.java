package pe.egcc.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.egcc.eureka.service.PropietarioService;

/**
 * Servlet implementation class PropietarioController
 */
@WebServlet("/PropietarioController")
public class PropietarioController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String tipoDoc = request.getParameter("tipoDoc");
		String numeDoc = request.getParameter("numeDoc");
		String paterno = request.getParameter("paterno");
		String materno = request.getParameter("materno");
		String nombres = request.getParameter("nombres");

		// Proceso
		PropietarioService propService;
		propService = new PropietarioService();

		propService.spNuevoPropietario(tipoDoc, numeDoc, paterno, materno, nombres);

		request.setAttribute("message", propService.getMensaje());
		// Forward
		List<Map<String, ?>> lista = propService.traerPropietarios();
		request.setAttribute("lista", lista);

		RequestDispatcher rd = request.getRequestDispatcher("propietarios.jsp");
		rd.forward(request, response);
		// }

	}
}
