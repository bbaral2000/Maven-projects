package com.ecommerce.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.DBConnection.dbConnection;


@Service
public class CartServices {

	@Autowired
	dbConnection connect1;

	
	
    public List<cart> retrivecart(String catagory){
    	List<cart> cartitems= new ArrayList<cart>();
		try {
			Connection con=connect1.connect();
			PreparedStatement ps= con.prepareStatement("select * from cart.products where catagory= ? ");
			ps.setString(1, catagory);
			ResultSet rs= ps.executeQuery();
			while (rs.next()){
				
				cartitems.add(new cart(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
				System.out.println();
			}
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	return cartitems;
	
    }

}
