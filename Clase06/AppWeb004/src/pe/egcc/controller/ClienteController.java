package pe.egcc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.egcc.eureka.dto.ClienteDto;
import pe.egcc.eureka.service.ClienteService;


@WebServlet({ "/ClienteController", "/ConsultarClientes" })
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// Datos
		String paterno = request.getParameter("paterno");
		String materno = request.getParameter("materno");
		String nombre = request.getParameter("nombre");
		// Proceso
		ClienteService clienteService;
		clienteService = new ClienteService();
		List<ClienteDto> lista = clienteService.getClientes(paterno, materno, nombre);
		System.err.println("ORROR: " + clienteService.getMensaje());
		// Forward
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
