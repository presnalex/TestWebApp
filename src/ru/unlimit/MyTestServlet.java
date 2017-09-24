package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyTestServlet")
public class MyTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("info from user");
		
		String FirstName = request.getParameter("FirstName");
		String SecondName = request.getParameter("SecondName");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h3>Saying hi from Александр</h3><br>I'm your friend<br>");
		out.println("Рад познакомиться" + " " + FirstName + " " +  SecondName);
		out.close();
		
	}

}
