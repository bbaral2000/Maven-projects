package com.ecommerce.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Service;

@Service
public class dbConnection {
	
	public Connection connect() throws Exception{
		Connection conn = null;
	    Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/cart","root","Battula1994!");
		if (conn == null){
			System.out.println("not Connected");
			throw new NullPointerException();
		}
		return conn;		
	}

}