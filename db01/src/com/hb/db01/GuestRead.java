package com.hb.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;
import oracle.jdbc.pool.OracleDataSource;

public class GuestRead {

	public static void main(String[] args) {
		// crud
		// r : read, select
		//p.276~287
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String sql ="select id,pw from guest";
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection conn = DriverManager.getConnection(url, user, password);
			OracleDataSource ods = new OracleDataSource();
			ods.setURL(url);
			ods.setUser(user);
			ods.setPassword(password);
			Connection conn = ods.getConnection();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()==true){
				System.out.println(rs.getString(1)+":"+rs.getString(2));
			}
			
		} catch (Exception e) {
			System.out.println("문제 있음");
		}
		

	}

}
