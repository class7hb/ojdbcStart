package com.hb.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class GuestAdd {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է�:");
		String id = sc.nextLine();
		System.out.print("�н����� �Է�:");
		String pw = sc.nextLine();
		String url = "jdbc:oracle:thin:@203.236.209.193:1521:xe";
		String sql ="insert into guest values ('"+id+"','"+pw+"')";
//		String sql ="update guest set pw='"+pw+"' where id='"+id+"'";
//		String sql ="delete from guest where id='"+id+"'";
		System.out.println("sql:"+sql);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection cnn = DriverManager.getConnection(url,"scott","tiger");
			Properties info = new Properties();
			info.setProperty("user", "scott");
			info.setProperty("password", "tiger");
			Connection cnn = DriverManager.getConnection(url, info);
			System.out.println("���Ӽ���");
			Statement stmt = cnn.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("�Է¼���");
		} catch (ClassNotFoundException e1) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���ӽ���");
		}

	}

}
