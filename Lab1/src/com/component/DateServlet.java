package com.component;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Date date = new Date();
		PrintWriter out = response.getWriter();
		System.out.println("apap");
		out.println("<h3>Date and Time</h3>");
		out.println("</br>");
		out.println(date.toString());
	}

}
