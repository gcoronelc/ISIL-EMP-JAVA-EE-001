package pe.egcc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.egcc.util.Mensaje;

public class UtilController {

	public static void sendMessageAJAX(HttpServletRequest request, 
			HttpServletResponse response, Mensaje message) 
			throws IOException {
		
		Gson gson = new Gson();
		String textoJson = gson.toJson(message);
		
		// Respuesta
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(textoJson);
		response.getWriter().flush();
		
	}


	
}
