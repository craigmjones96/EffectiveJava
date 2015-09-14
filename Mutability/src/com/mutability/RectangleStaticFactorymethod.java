package com.mutability;

// alternative approach - static factory methods
// allows class still to be overridden but doesn't expose
// this to the client (just internally) due to private constructors

// public class, rather than private
public class RectangleStaticFactorymethod {

	// final fields
	private final int height;
	private final int width;
	
	// private constructor so class cant be extended
	// could use package-private if you wanted to provide multiple
	// instances of the class (extensions) which you manage but not visible to clients
	private RectangleStaticFactorymethod(int height, int width) {
		this.height = height;
		this.width = width;
	}

	// only accessors
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	
	// static factory method to create an instance and it always returns a new instance
	// (that is obviously immutable)
	public static RectangleStaticFactorymethod createRectanlge(int height, int width) {
		return new RectangleStaticFactorymethod(height, width);
	}
	
}
