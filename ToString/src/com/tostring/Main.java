package com.tostring;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Address address = new Address(151, "StreetName", "CityName", "B783RE");
		
		// Custom object with overwritten toString
		System.out.println("Address: " + address);
		
		// Value object (toString only returns the value, rather than object representation
		System.out.println("BigDecimal details: " + new BigDecimal("123.456").toString());
	}
}
