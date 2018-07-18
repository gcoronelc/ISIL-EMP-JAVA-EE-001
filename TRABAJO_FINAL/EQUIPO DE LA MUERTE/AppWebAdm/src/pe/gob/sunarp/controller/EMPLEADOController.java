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

import com.google.gson.Gson;

import pe.gob.sunarp.adm.service.EMPLEADOService;

@WebServlet({ "/EMPLEADOController", "/getUsuarios", "/editEmpleado","/editEmpleado_post","/getEmpleadosByTagsAJAX",
	"/createEmpleado"})
public class EMPLEADOController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * request.setAttribute("message", "hello"); RequestDispatcher
	 * view=request.getRequestDispatcher("EMPLEADO/ListEmpleados.jsp");
	 * view.forward(request,response); }
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();

		switch (path) {
		case "/getUsuarios":
			getEmpleadosByTags(request, response);
			break;
		case "/getEmpleadosByTagsAJAX":
			getEmpleadosByTagsAJAX(request, response);
			break;
		case "/editEmpleado":
			editEmpleado(request, response);
			break;
		case "/editEmpleado_post":
			editEmpleado_post(request, response);
			break;
		case "/createEmpleado":
			createEmpleado(request, response);
			break;
		}

	}

	private void createEmpleado(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String CO_AREA = request.getParameter("CO_AREA");
		String CO_CARGO = request.getParameter("CO_CARGO");
		String EST_EMPL = request.getParameter("EST_EMPL");
		String APE_PAT = request.getParameter("APE_PAT");
		String APE_MAT = request.getParameter("APE_MAT");
		String NOMBRE = request.getParameter("NOMBRE");

		// Proceso
		EMPLEADOService service = new EMPLEADOService();		
		service.createEmpleado(CO_AREA, CO_CARGO, EST_EMPL, APE_PAT, APE_MAT, NOMBRE);
		//Map<String, ?> EMPLEADO = service.getEmpleadoByID(CO_EMPL);
		// Forward
		//request.setAttribute("EMPLEADO", EMPLEADO);
		//RequestDispatcher rd = request.getRequestDispatcher("Views/EMPLEADO/EditEmpleado.jsp");
		//rd.forward(request, response);
		
		RequestDispatcher rd;
		if (service.getCode() == 1) {
			rd = request.getRequestDispatcher("Views/EMPLEADO/ListEmpleados.jsp");
			// rd1.forward(request, response);
		} else {
			request.setAttribute("mensaje", service.getMensaje());
			rd = request.getRequestDispatcher("Views/EMPLEADO/CreateEmpleado.jsp");
		}													  
		rd.forward(request, response);				
	}
	
	private void editEmpleado(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String CO_EMPL = request.getParameter("CO_EMPL");
		// Proceso
		EMPLEADOService service = new EMPLEADOService();
		/* Buscamos */

		Map<String, ?> EMPLEADO = service.getEmpleadoByID(CO_EMPL);
		// Forward
		request.setAttribute("EMPLEADO", EMPLEADO);
		RequestDispatcher rd = request.getRequestDispatcher("Views/EMPLEADO/EditEmpleado.jsp");
		rd.forward(request, response);

	}
	

	private void editEmpleado_post(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String CO_EMPL = request.getParameter("CO_EMPL");
		String APE_PAT = request.getParameter("APE_PAT");
		String APE_MAT = request.getParameter("APE_MAT");
		String NOMBRE = request.getParameter("NOMBRE");
		String CO_AREA = request.getParameter("CO_AREA");
		String CO_CARGO = request.getParameter("CO_CARGO");
		String EST_EMPL = request.getParameter("EST_EMPL");

		// Proceso
		EMPLEADOService service = new EMPLEADOService();
		
		service.editEmpleadoData(CO_EMPL, APE_PAT, APE_MAT, NOMBRE,CO_AREA,CO_CARGO,EST_EMPL);
		//Map<String, ?> EMPLEADO = service.getEmpleadoByID(CO_EMPL);
		// Forward
		//request.setAttribute("EMPLEADO", EMPLEADO);
		//RequestDispatcher rd = request.getRequestDispatcher("Views/EMPLEADO/EditEmpleado.jsp");
		//rd.forward(request, response);
		
		RequestDispatcher rd;
		if (service.getCode() == 1) {
			rd = request.getRequestDispatcher("Views/EMPLEADO/ListEmpleados.jsp");
			// rd1.forward(request, response);
		} else {
			request.setAttribute("mensaje", service.getMensaje());
			rd = request.getRequestDispatcher("Views/EMPLEADO/EditEmpleado.jsp");
		}
		rd.forward(request, response);				
	}

	private void getEmpleadosByTags(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		// String cuenta = request.getParameter("cuenta");
		String paterno = request.getParameter("txtPaterno");
		String materno = request.getParameter("txtMaterno");
		String nombre = request.getParameter("txtNombre");
		// Proceso
		EMPLEADOService service = new EMPLEADOService();
		List<Map<String, ?>> lista = service.getEmpleadosByTags(paterno, materno, nombre);
		System.err.println("CODE: " + service.getCode());
		System.err.println("MENSAJE: " + service.getMensaje());
		System.err.println("Cantidad de lista: " + lista.size());

		// Forward
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Views/EMPLEADO/ListEmpleados.jsp");
		rd.forward(request, response);
	}

	private void getEmpleadosByTagsAJAX(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Datos
		String paterno = request.getParameter("paterno");
		String materno = request.getParameter("materno");
		String nombre = request.getParameter("nombre");
		// Proceso
		EMPLEADOService service = new EMPLEADOService();
		List<Map<String, ?>> lista = service.getEmpleadosByTags(paterno, materno, nombre);
		System.err.println("CODE: " + service.getCode());
		System.err.println("MENSAJE: " + service.getMensaje());
		System.err.println("Cantidad de lista: " + lista.size());

		// Forward
		/*request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Views/EMPLEADO/ListEmpleados.jsp");
		rd.forward(request, response);*/
		// Crear cadena JSON
		Gson gson = new Gson();
		String cadenaJson = gson.toJson(lista);
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(cadenaJson);
		response.getWriter().flush();
		System.err.println("cadenaJson de " + paterno + ": " + cadenaJson);
		
	}

}
