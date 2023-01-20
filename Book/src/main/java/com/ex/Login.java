package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
  //private static final long serialVersionUID = 1L;
Connection con=null;
  PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			con = DatabaseConnection.getConnection();	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession hs=request.getSession();
	
		
		try {
			ps=con.prepareStatement ("select * from register where username=? and password=?");
			ps.setString(1,  username);
			ps.setString(2,  password);
			
			ResultSet x=ps.executeQuery();
			if(x.next())
			{
				hs.setAttribute("id",  x.getInt(1));
				hs.setAttribute("email",  x.getString(4));
				hs.setAttribute("name",  x.getString(2));
				response.sendRedirect("./home.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
