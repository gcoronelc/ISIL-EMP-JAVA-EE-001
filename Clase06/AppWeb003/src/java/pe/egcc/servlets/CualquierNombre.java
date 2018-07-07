package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "CualquierNombre",
        urlPatterns = {"/ProcesarSuma", "/ProcesarResta"}
)
public class CualquierNombre extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();
    
    switch(path){
      case "/ProcesarSuma":
         magiaSumar(request, response);
         break;
      case "/ProcesarResta":
         magiaRestar(request, response);
         break;
         
    }
    
   

  }

  private void magiaSumar(HttpServletRequest request, HttpServletResponse response)
          throws IOException, ServletException {
    
    // Datos
    int n1 = Integer.parseInt(request.getParameter("num1"));
    int n2 = Integer.parseInt(request.getParameter("num2"));

    // Proceso
    int suma = n1 + n2;

    // Reporte
    request.setAttribute("n1", n1);
    request.setAttribute("n2", n2);
    request.setAttribute("suma", suma);
    
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("rptaSuma.jsp");
    rd.forward(request, response);
    
  }
  
   private void magiaRestar(HttpServletRequest request, HttpServletResponse response)
          throws IOException {
    
    // Datos
    int n1 = Integer.parseInt(request.getParameter("num1"));
    int n2 = Integer.parseInt(request.getParameter("num2"));

    // Proceso
    int resta = n1 - n2;

    // Reporte
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>RESTA</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>RESTA</h1>");
    out.println("<p>Número 1: " + n1 + " </p>");
    out.println("<p>Número 2: " + n2 + " </p>");
    out.println("<p>Resta: " + resta + " </p>");
    out.println("</body>");
    out.println("</html>");
    out.flush();
    out.close();

  }

}
