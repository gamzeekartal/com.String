package com.String;

public class playingWithString {

	public static void main(String[] args) {
		int x = 307; 
		
		String s1 = "Computer Science";
		String s2 = s1 + " " + x;
		String s3 = s1.substring(7,10);
		String s4 = "is fun";
		String s5 = s2 + s4;
		
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		System.out.println("S3: " + s3);
		System.out.println("S4: " + s4);
		System.out.println("S5: " + s5);
		
		
		int y=5; x=3;
		
		String s6 = Integer.toString(x) + Integer.toString(y) + Integer.toString(x + y);
		String s7 = Integer.toString(x + y) + Integer.toString(x) + Integer.toString(y);
		String s8 = x + " " + y + " " + Integer.toString(x+y);
		
		System.out.println("S6: " + s6);
		System.out.println("S7: " + s7);
		System.out.println("S8: " + s8);
		
	}

}
