package com.chandra.demo.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chandra.demo.managedbean.TestBean;

@WebServlet("/index.html")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private TestBean bean;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		bean.test("Test Successful!");
		bean.test2("Test Successful2!");
		bean.test3("Test Successful3!");
		request.setAttribute("status", "Successful");
		request.getRequestDispatcher("WEB-INF/pages/test.jsp").forward(request, response);
	}
}
