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

import pe.egcc.eureka.service.PartidaService;

@WebServlet({ "/PartidaController", "/ConsultarPartidas" })
public class PartidaController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Datos
		String oficina = request.getParameter("oficina");
		String registro = request.getParameter("registro");
		String partida = request.getParameter("partida");
		String detalle = request.getParameter("detalle");
		
		String abc = request.getParameter("things");
		

		// Proceso
		PartidaService partidaService;
		partidaService = new PartidaService();

		partidaService.spNuevaPartida(oficina, registro, partida, detalle);

		request.setAttribute("message", partidaService.getMensaje());
		// Forward
		List<Map<String, ?>> lista = partidaService.traerPartidas();
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("partidas.jsp");
		rd.forward(request, response);

	}
	
	
	
/* public List<String> getItems() {
        List<String> list = new ArrayList<String>();
        list.add("Thing1");
        list.add("Thing2");
        list.add("Thing3");
        return list;
    }
 * */

}
