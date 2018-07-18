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

import pe.egcc.eureka.service.RegistroService;

@WebServlet("/RegistroController")
public class RegistroController extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String oficina = request.getParameter("oficina");
		String registro = request.getParameter("registro");
		String partida = request.getParameter("partida");
		String tipoDoc = request.getParameter("tipoDoc");
		String numeDoc = request.getParameter("numeDoc");

		// Proceso
		RegistroService regiService = new RegistroService();
		
		regiService.spNuevaRegistro(oficina, registro, partida, tipoDoc, numeDoc);

		request.setAttribute("message", regiService.getMensaje());
		// Forward
		List<Map<String, ?>> lista = regiService.traerRegistros();
		request.setAttribute("lista", lista);

		RequestDispatcher rd = request.getRequestDispatcher("registros.jsp");
		rd.forward(request, response);

	}

}
