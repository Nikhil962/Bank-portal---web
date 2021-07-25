package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBC {
	public static String url = "jdbc:mysql://localhost:3306/pro1";
    
    public static String userName = "root";
    public static String password = "Nikhil@123";
          @SuppressWarnings("deprecation")
          public static Connection getConnection() {
          Connection connection = null;
          if (connection != null)
          {
                return connection;
          }
          try {
                     
            Class.forName("com.mysql.cj.jdbc.Driver");
connection = DriverManager.getConnection(url,userName,password);
          } catch (Exception e) {
                e.printStackTrace();
          }
          return connection;
    }
}
