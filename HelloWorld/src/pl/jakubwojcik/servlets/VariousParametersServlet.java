package pl.jakubwojcik.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VariousParametersServlet
 */
@WebServlet("/VariousParametersServlet")
public class VariousParametersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VariousParametersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Insert various parameters!</h1>");
		out.println("<div><form action=\"http://localhost:9999/HelloWorld/various_parameters\" method=\"post\">");
		out.println("<label for=\"liczba_zmiennych\">Podaj liczbe zmiennych:</label>");
		out.println("<input type=\"number\" name=\"liczba_zmiennych\" id=\"liczba_zmiennych\"><br/>");
		out.println("<input type=\"hidden\" name=\"kontrolka\"  value=\"0\">");
		out.println("<input type=\"submit\" value=\"Wyslij!\"");
		out.println("</form></div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (Integer.parseInt(request.getParameter("kontrolka")) == 0) {
			int liczbaZmiennych = Integer.parseInt(request.getParameter("liczba_zmiennych").toString());
			out.println("<div><form action=\"http://localhost:9999/HelloWorld/various_parameters\" method=\"post\">");
			for (int i = 1; i <= liczbaZmiennych; i++) {// stworzenie
														// odpowiedniej ilości
														// textboxów
				out.println("<label for=\"param" + i + "\">Parametr" + i + "</label>");
				out.println("<input type=\"text\" name=\"param" + i + "\" id=\"param" + i + "\"><br/>");
			}
			out.println("<input type=\"hidden\" name=\"kontrolka\" value=\"1\">");
			out.println("<input type=\"submit\" value=\"Przeslij parametry!\">");
			out.println("</form></div>");
		}
		else if(Integer.parseInt(request.getParameter("kontrolka").toString()) == 1){
			//Set<String> parameterNames = request.getParameterMap().keySet();
			ArrayList<String> parameterNames = new ArrayList<String>(request.getParameterMap().keySet());
//			parameterNames.forEach(p -> out.println("Nazwa parametru: " + p + "<br/>"));
			parameterNames.stream().filter(p -> !p.equals("kontrolka"))
				.forEach(p -> out.println("Nazwa parametru: " + p + "<br/>"));
		}
	}

}
