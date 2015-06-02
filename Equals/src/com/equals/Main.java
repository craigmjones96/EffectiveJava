package com.equals;

public class Main {

	public static void main(String[] args) {
		CustomString a = new CustomString("value1");
		CustomString b = new CustomString("value2");
		
		System.out.println(a.equals(b));
		
		CustomString c = a;
		
		System.out.println(a.equals(c));
	}
}
