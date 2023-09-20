package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstservlet
 */
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;
	public void init(ServletConfig config) throws ServletException {
		count=1;
		System.out.println("init called");
	}
	public void destroy() {
		System.out.println("destroy called");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get called");
		System.out.println("count is " +count++);
		PrintWriter out=response.getWriter();
		out.println("<br> count is  " +count);
	}

}
