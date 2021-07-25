package com.reg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationpagedata
 */
@WebServlet("/registrationpagedata")
public class registrationpagedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationpagedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			final String JD_Driver="com.mysql.cj.jdbc.Driver";
			final String DB_URL="jdbc:mysql://localhost/pro1";
			
			final String USER="root";
			final String PASS="Nikhil@123";
			Connection conn=null;
			PreparedStatement stmt=null;
			
			
				Class.forName(JD_Driver);
				System.out.println("connecting");
				conn=DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Connected");
				
				System.out.println("Inserting records into the table...");
				stmt=conn.prepareStatement("insert into bank values(?,?,?,?,?,?,?)");
				stmt.setString(1, request.getParameter("n1"));
				stmt.setString(2, request.getParameter("dob1"));
				stmt.setString(3, request.getParameter("ban1"));
				stmt.setString(4, request.getParameter("ifse1"));
				stmt.setString(5, request.getParameter("mon1"));
				stmt.setString(6, request.getParameter("a1"));
				stmt.setString(7, request.getParameter("pass"));
				stmt.executeUpdate();
				
				System.out.println("Inserted recors into the table");
				request.getRequestDispatcher("loginpage.jsp").forward(request,  response);				
			} catch (Exception e) {
				System.out.println("Wrong");
				e.printStackTrace();
			}
	}

}
