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

import pe.egcc.eureka.service.PropietarioService;
import pe.egcc.eureka.service.RegistroService;
import pe.egcc.eureka.dto.ClienteDto;
import pe.egcc.eureka.service.ClienteService;
import pe.egcc.eureka.service.CuentaService;
import pe.egcc.eureka.service.PartidaService;

@WebServlet({ "/ConsultarProp", "/ConsultarPart", "/ConsultarRegi" })
public class ListadoRegistrosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		switch (path) {
		case "/ConsultarProp":
			consultarPropietarios(request, response);
			break;
		case "/ConsultarPart":
			consultarPartidas(request, response);
			break;
		case "/ConsultarRegi":
			consultarRegistros(request, response);
			break;
		}
	}
	
	protected void consultarPropietarios(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// Proceso
		PropietarioService propService;
		propService = new PropietarioService();

		// Forward
		List<Map<String, ?>> lista = propService.traerPropietarios();
		// Crear cadena JSON
		Gson gson = new Gson();
		String cadenaJson = gson.toJson(lista);
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(cadenaJson);
		response.getWriter().flush();
	}

	protected void consultarPartidas(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		// Proceso
		PartidaService partidaService;
		partidaService = new PartidaService();

		request.setAttribute("message", partidaService.getMensaje());
		// Forward
		List<Map<String, ?>> lista = partidaService.traerPartidas();
		
		// Crear cadena JSON
		Gson gson = new Gson();
		String cadenaJson = gson.toJson(lista);
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(cadenaJson);
		response.getWriter().flush();
	}	
	
	protected void consultarRegistros(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		// Proceso
		RegistroService regiService = new RegistroService();
		
		// Forward
		List<Map<String, ?>> lista = regiService.traerRegistros();
		
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
