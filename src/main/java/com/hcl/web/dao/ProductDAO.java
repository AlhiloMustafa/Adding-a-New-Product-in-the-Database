package com.hcl.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hcl.web.model.Product;


public class ProductDAO {
	
	
	public Product getProduct(int pid) {
		
		Product product= new Product();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connectionToDB= DriverManager.getConnection("jdbc:mysql://localhost:3306/store?createDatabaseIfNotExist=true", "root", "root");
			Statement st = connectionToDB.createStatement();
			ResultSet resultData= st.executeQuery("select * from products where id="+pid+";");
			
			if(resultData.next()) {
				
				product.setId(resultData.getInt("id"));
				product.setName(resultData.getString("name"));
				product.setCompany(resultData.getString("company"));
			}
			
		}catch(SQLException e) {
			System.out.println("sql problem:"+e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product;
		
		
	}
	
	

}
