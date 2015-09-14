package com.mutability;

// class is final so cant be extended
public final class Rectangle {

	// variables are final and of class types that are immutable
	private final int height;
	private final int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	// only have accessors (not mutators)
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	
	public Rectangle addHeight(int height) {
		return new Rectangle(this.height + height, this.width);
	}
	
	public Rectangle addWidth(int width) {
		return new Rectangle(this.height, this.width + width);
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
}
