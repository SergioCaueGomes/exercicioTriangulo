package br.com.rd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tipoTriangulo
 */
@WebServlet("/tipoTriangulo")
public class tipoTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tipoTriangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int val1, val2, val3;
		val1 = Integer.parseInt(request.getParameter("val1"));
		val2 = Integer.parseInt(request.getParameter("val2"));
		val3 = Integer.parseInt(request.getParameter("val3"));
		
		
		
		if(val1 < 0 && val2 < 0 && val3 < 0) {
			response.getWriter().println("Favor digitar um valor valido");
			
		}else if(val2 <= 0 && val3 <= 0 && val1 < 0 || val3<= 0 && val1 <= 0 || val2 <= 0 && val1 <= 0  ){
			response.getWriter().println("Você construiu uma reta.");
			
		}else if(val1 > 0 && val2 > 0 && val3 <= 0 || val3 > 0 && val1 > 0 || val2 <= 0 || val3 > 0 && val2 > 0 && val1 <= 0){
			if(val1 == val2 && val2 == 3 && val1 == val2) {
				response.getWriter().println("Você construiu um quadrado");

			}else {
				response.getWriter().println("Você construiu um retangulo");
				
			}
			
			
		}else if(val1 != val2 && val2 != val3 && val3 != val1) {
			response.getWriter().println("Você construiu um triangulo escaleno");
				
			}else if(val1 == val2 && val2 == val3 && val3 == val1) {
				response.getWriter().println("Você constriu um triangulo equilatero");
			}else {
				response.getWriter().println("Você construiu um triangulo isoceles");
			}
			
	}
}


		
	


