package com.comparable;

public class ComparableMain {

	public static void main(String[] args) {

		PhoneNumber pn1 = new PhoneNumber(1, 2, 3);
		PhoneNumber pn2 = new PhoneNumber(1, 2, 4);
		PhoneNumber pn3 = new PhoneNumber(1, 4, 3);
		PhoneNumber pn4 = new PhoneNumber(4, 2, 3);
		PhoneNumber pn5 = new PhoneNumber(4, 5, 6);
		PhoneNumber pn6 = new PhoneNumber(1, 2, 3);
		PhoneNumber pn7 = new PhoneNumber(1, 2, 2);
		
		PhoneNumberComparator comparator = new PhoneNumberComparator();
		
		System.out.println("==== COMPARABLE INTERFACE - COMPARETO ====");
		
		System.out.println("pn1 compareTo pn2: " + pn1.compareTo(pn2));
		System.out.println("pn1 compareTo pn3: " + pn1.compareTo(pn3));
		System.out.println("pn1 compareTo pn4: " + pn1.compareTo(pn4));
		System.out.println("pn1 compareTo pn5: " + pn1.compareTo(pn5));
		System.out.println("pn1 compareTo pn6: " + pn1.compareTo(pn6));
		System.out.println("pn1 compareTo pn7: " + pn1.compareTo(pn7));
		
		System.out.println("==== COMPARATOR INTERFACE - COMPARE ====");
		
		System.out.println("pn1 compareTo pn2: " + comparator.compare(pn1,pn2));
		System.out.println("pn1 compareTo pn3: " + comparator.compare(pn1,pn3));
		System.out.println("pn1 compareTo pn4: " + comparator.compare(pn1,pn4));
		System.out.println("pn1 compareTo pn5: " + comparator.compare(pn1,pn5));
		System.out.println("pn1 compareTo pn6: " + comparator.compare(pn1,pn6));
		System.out.println("pn1 compareTo pn7: " + comparator.compare(pn1,pn7));
	}
}
