package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDao {
	public User checkLogin(String email, String password) throws SQLException,
    ClassNotFoundException {

    	// JDBC driver name and database URL
    	    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    	    final String DB_URL = "jdbc:mysql://localhost/pro1";

    	   //  Database credentials
    	    final String USER = "root";
    	   final String PASS = "Nikhil@123";
    	System.out.println("hi");
Connection conn = null;
PreparedStatement stmt = null;

  //STEP 2: Register JDBC driver
  Class.forName(JDBC_DRIVER);

  //STEP 3: Open a connection

  conn = DriverManager.getConnection(DB_URL, USER, PASS);
  String sql = "SELECT * FROM bank WHERE name = ? and pass = ?";
  PreparedStatement statement = conn.prepareStatement(sql);
  statement.setString(1, email);
  statement.setString(2, password);

  ResultSet result = statement.executeQuery();

  User user = null;

  if (result.next()) {
      user = new User();
      user.setName(result.getString("name"));
      user.setPass(result.getString("pass"));
      user.setAmount(result.getString("amount"));
      user.setDof(result.getString("dof"));
      user.setBankaccountno(result.getString("bankaccountno"));
      user.setIfsecode(result.getString("ifsecode"));
      user.setMobileno(result.getString("mobileno"));
      
  }


  conn.close();

  return user;
    	
  

}

}
