package com.hb.db01;

public class Ex02 {
	int a=1000;

	public static void main(String[] args) {
//		Ex02 me = new Ex02();
//		System.out.println(me.a);
		try {
			Class meC = Class.forName("com.hb.db01.Ex02");
			Ex02 me= (Ex02) meC.newInstance();
			System.out.println(me.a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
