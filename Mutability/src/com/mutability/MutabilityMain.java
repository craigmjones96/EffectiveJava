package com.mutability;

import java.math.BigInteger;

public class MutabilityMain {

	// it is encouraged to provide re-usable immutable classes for frequent
	// instances as it helps reduce the amounts of objects in the system.
	// because they are immutable there are no side effects to multiple
	// clients / threads / etc. using them at the same time.
	public static final Rectangle TWO_BY_FOUR = new Rectangle(2, 4);
	public static final Rectangle FOUR_BY_SIX = new Rectangle(4, 6);
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 4);
		
		System.out.println(rectangle);
		// this call generates a new object
		System.out.println(rectangle.addHeight(4));
		// same as the first print out as the original object wasnt changed
		System.out.println(rectangle);
		
		
		// A good technique is to generate regularly used constanst and cache them
		// and then supply a staticFactoryMethod that will return a cached value if
		// it is requested. Below is the static method from BigInteger that creates 
		// BigInteger objects from 1-16 (positive and negative) and caches them. So
		// when we call BigInteger.valueOf(1); the valueOf method will actually return 
		// the object already created (follow the BigInteger source code to confirm).
//		static {
//	        for (int i = 1; i <= MAX_CONSTANT; i++) {
//	            int[] magnitude = new int[1];
//	            magnitude[0] = i;
//	            posConst[i] = new BigInteger(magnitude,  1);
//	            negConst[i] = new BigInteger(magnitude, -1);
//	        }
//		}
	    BigInteger bigInteger = BigInteger.valueOf(1);
	}
}
