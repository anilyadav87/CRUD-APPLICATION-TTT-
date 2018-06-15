package com.anil.crud;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import com.anil.implementation.empImplement;
import com.anil.model.*;
/**
 * Servlet implementation class UserController
 */
@WebServlet("/")
public class UserController extends HttpServlet {
	empImplement emp = new empImplement();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		printRecord(request, response);
	}
		public void printRecord(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			
			List<EmployeeModel> d = emp.employeeList();
			request.setAttribute("data", d);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/View/ViewData.jsp");
			dispatcher.forward(request, response);
		}

		public void insertRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			/*data.insertData();
			request.getAttribute("id");*/
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/View/Insert.jsp");
			dispatcher.forward(request, response);
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
