package com.constructor;

import java.util.Date;

public class Sub extends Super {

	Date date;
	
	public Sub() {
		date = new Date();
	}

	@Override
	public void overrideMe() {
		System.out.println("Sub method: " + date);
	}
}
