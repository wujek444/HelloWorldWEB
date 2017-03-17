package pl.jakubwojcik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1>Hello World Header!</h1>");
        out.print("<div>Hello world content</div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/\">Go back to index site!</a></div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/parameters_servlet?parametr1=java&parametr2=start&parametr3=javaEE\">Go to parameters page!</a></div>");
    }
}
