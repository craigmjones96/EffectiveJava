package com.inheritance;

import java.util.ArrayList;

public class InheritanceMain {

	public static void main(String[] args) {
		MyArrayListImplementationExtension ext = new MyArrayListImplementationExtension();
		System.out.println("ext count: " + ext.getAddCount());
		
		System.out.println("adding 3 elements via addAll");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Craig");
		list.add("Michael");
		list.add("Anthony");
		ext.addAll(list);
		
		System.out.println("ext count: " + ext.getAddCount());
	}
}
