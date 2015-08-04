package com.comparable;

import java.util.Comparator;

public class PhoneNumberComparator implements Comparator<PhoneNumber>{

	@Override
	public int compare(PhoneNumber o1, PhoneNumber o2) {
		int prefixDiff = o1.getPrefix() - o2.getPrefix();
		if(prefixDiff!=0)
			return prefixDiff;
		
		int areaCodeDiff = o1.getAreaCode() - o2.getAreaCode();
		if(areaCodeDiff!=0)
			return areaCodeDiff;
		
		// if we get to the last comparison we can just return the result
		return o1.getLineNumber() - o2.getLineNumber();
	}

}
