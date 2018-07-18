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

import com.google.gson.Gson;

import pe.egcc.eureka.dto.ClienteDto;
import pe.egcc.eureka.service.ClienteService;
import pe.egcc.eureka.service.CuentaService;


@WebServlet({ "/ConsultarMovimientos", "/ConsultarClientes" })
public class CuentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		switch (path) {
		case "/ConsultarMovimientos":
			consultarMovimientos(request, response);
			break;
		case "/ConsultarClientes":
			consultarClientes(request, response);
			break;
		}
		
	}

	protected void consultarMovimientos(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// Datos
		String cuenta = request.getParameter("cuenta");
		// Proceso
		CuentaService cuentaService;
		cuentaService = new CuentaService();
		List<Map<String,?>> lista = cuentaService.traerMovimientos(cuenta);
		//System.err.println("Movimientos de " + cuenta + ": " + lista.size());
		// Crear cadena JSON
		Gson gson = new Gson();
		String cadenaJson = gson.toJson(lista);
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(cadenaJson);
		response.getWriter().flush();
	}

	protected void consultarClientes(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// Datos
		String paterno = request.getParameter("paterno");
		String materno = request.getParameter("materno");
		String nombre = request.getParameter("nombre");
		// Proceso
		ClienteService clienteService;
		clienteService = new ClienteService();
		List<ClienteDto> lista = clienteService.getClientes(paterno, materno, nombre);
		System.err.println("Clientes: " + lista.size());
		// Crear cadena JSON
		Gson gson = new Gson();
		String cadenaJson = gson.toJson(lista);
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(cadenaJson);
		response.getWriter().flush();
	}

}
