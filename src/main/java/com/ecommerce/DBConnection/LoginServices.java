package com.ecommerce.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServices {
	@Autowired
	dbConnection connection;
	boolean isDone;
	public boolean isValid(String username, String password){
		try{
			Connection connect = connection.connect();
		
		PreparedStatement ps = connect
				.prepareStatement("select userName,Password from logintable where userName = ? and Password = ?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
		if (rs.getString(1) != null && rs.getString(2) != null) {
			isDone = true;
		} else {
			isDone = false;
		 }
		}
		connect.close();
	}catch(Exception e){e.printStackTrace();}
		return isDone;
	}
	public boolean inserted(String username,String password){
		try {
			Connection connect= connection.connect();
			PreparedStatement ps=connect.prepareStatement("insert into  logintable(userName,Password) values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			int rs= ps.executeUpdate();
			if(rs==1){
				isDone= true;
			}else{
				isDone=false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDone;
		
		
	}
	
}
