package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String username;
       
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.getWriter().println("Hello World!"); 
		response.setContentType("text/html");
		PrintWriter prn = response.getWriter();
		String name = request.getParameter("name");
		prn.println("Welcome" +name);
		
	}
	
	
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
