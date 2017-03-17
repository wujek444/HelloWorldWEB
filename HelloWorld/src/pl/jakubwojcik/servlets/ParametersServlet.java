package pl.jakubwojcik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParametersServlet
 */
@WebServlet("/parameters")
public class ParametersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParametersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    static protected String returnStringIfNotNull(String str){
    	if(!str.equals(null)) return str;
    	else return null;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Parameters servlet!</h1>");
		
		String parametr1 = returnStringIfNotNull(request.getParameter("parametr1"));
        String parametr2 = request.getParameter("parametr2");
        String parametr3 = request.getParameter("parametr3");
 
        out.println("Wczytanie 3 parametrow z zadania :");
        out.println("<br/>" + parametr1);
        out.println("<br/>" + parametr2);
        out.println("<br/>" + parametr3);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		out.println("<h1>Parameters servlet!</h1>");
		
		String parametr1 = returnStringIfNotNull(request.getParameter("parametr1"));
        String parametr2 = request.getParameter("parametr2");
        String parametr3 = request.getParameter("parametr3");
 
        out.println("Wczytanie 3 parametrow z zadania :");
        out.println("<br/>" + parametr1);
        out.println("<br/>" + parametr2);
        out.println("<br/>" + parametr3);
	}

}
