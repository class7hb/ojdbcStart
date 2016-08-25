package com.hb.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {

	public static void main(String[] args) {
		// 
		String url="jdbc:oracle:thin:@203.236.209.193:1521:xe";
		String user="scott";
		String password="tiger";
		// crud
		// c: insert
		// u: update
		// d: delete
//		String sql ="insert into guest values ('guest6','4321')";
//		String sql ="update guest set pw='1111' where id='guest6'";
		String sql ="delete from guest where id='guest4'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0){
				System.out.println("입력성공");
			}
		} catch (Exception e) {
			System.out.println("문제 있음");
		}
	}

}










