package pl.jakubwojcik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{
	private static final long serialVersionUID = 2L;
	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1>Index page header</h1>");
        out.print("<div>Index page content!</div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/hello\">Go to hello page!</a></div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/parameters_servlet?parametr1=java&parametr2=start&parametr3=javaEE\">Go to parameters page!</a></div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/wyslij\">Send something!</a></div>");
        out.print("<div><a href=\"http://localhost:9999/HelloWorld/average?int1=1&int2=2&int3=3&int4=4&int5=5\">Oblicz srednią!</a></div>");


    }
}
