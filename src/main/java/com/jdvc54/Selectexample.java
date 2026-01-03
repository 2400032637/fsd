package com.jdvc54;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Selectexample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/s54";
		String username = "root";
		String password = "root";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,username,password);
		String query = "select * from employee";
		PreparedStatement pst = con.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println("EmpId: "+rs.getInt(1)+"  EmpName:  "+rs.getString("ename"));
		}
		con.close();

	}

}