package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
public static Connection getConnection() throws ClassNotFoundException, SQLException{
	Class.forName ("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/bookapp";
	String username="root";
	String password="Sasi9672@";
	Connection connection=DriverManager.getConnection(url, username, password);
	return connection;
}
}
