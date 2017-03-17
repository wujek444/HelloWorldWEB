package pl.jakubwojcik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    static Integer returnAverage(Integer tab[]){
    	int sum = 0;
    	for(Integer i : tab){
    		sum+=i;
    	}
    	return sum/tab.length;
    }
    static boolean arrayHasNoNulls(Integer tab[]){
    	for(Integer i : tab){
    		if(i == null)return false; 
    	}
    	return true;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer parametry[] = {Integer.parseInt(request.getParameter("int1")), Integer.parseInt(request.getParameter("int2")),
				Integer.parseInt(request.getParameter("int3")), Integer.parseInt(request.getParameter("int4")),
				Integer.parseInt(request.getParameter("int5"))};
		PrintWriter out = response.getWriter();
		out.println("<h1>Average servlet</h1>");
		if(arrayHasNoNulls(parametry)){
			for(Integer i : parametry){
				int count = 1;
				out.println("<br/>Parametr" + count + "=" + i);
				count++;
			}
			out.println("<br/>Średnia wynosi: " + returnAverage(parametry));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
