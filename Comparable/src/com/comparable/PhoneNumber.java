package com.comparable;

public class PhoneNumber implements Comparable<PhoneNumber> {

	private final int prefix;
	private final int areaCode;
	private final int lineNumber;

	public PhoneNumber(int prefix, int areaCode, int lineNumber) {
		this.prefix = prefix;
		this.areaCode = areaCode;
		this.lineNumber = lineNumber;
	}
	
	public int getPrefix() {
		return prefix;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	
	// This first compareTo method is perfectly fine and returns limited
	// values (-1,0, or 1) but the second method is a little more efficient.
	// it returns a wider range of possible results but as long as it still
	// fits the contract of 'less than 0, 0 or more than 0' all is good
//	@Override
//	public int compareTo(PhoneNumber o) {
//		if(prefix > o.prefix)
//			return 1;
//		if(prefix < o.prefix)
//			return -1;
//		if(areaCode > o.areaCode)
//			return 1;
//		if(areaCode < o.areaCode)
//			return -1;
//		if(lineNumber > o.lineNumber)
//			return 1;
//		if(lineNumber < o.lineNumber)
//			return -1;
//		
//		return 0;
//	}

	@Override
	public int compareTo(PhoneNumber o) {
		int prefixDiff = prefix - o.prefix;
		if(prefixDiff!=0)
			return prefixDiff;
		
		int areaCodeDiff = areaCode - o.areaCode;
		if(areaCodeDiff!=0)
			return areaCodeDiff;
		
		// if we get to the last comparison we can just return the result
		return lineNumber - o.lineNumber;
	}
}
