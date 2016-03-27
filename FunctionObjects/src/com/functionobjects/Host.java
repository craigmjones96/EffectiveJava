package com.functionobjects;

// If the strategy is designed to be used more than once it is often best to instantiate
// it as a private static class and export it as a public static final field of the interface type

public class Host {

	private static class StrLenComparator implements Comparator<String> {
		@Override
		public int compare(String t1, String t2) {
			return t1.length() - t2.length();
		}
	}
	
	private static class StrFirstLetterAPositionComparator implements Comparator<String> {

		@Override
		public int compare(String t1, String t2) {
			return t1.indexOf("a") - t2.indexOf("a");
		}
	}
	
	public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenComparator();
	public static final Comparator<String> STRING_A_POSITION_COMPARATOR = new StrFirstLetterAPositionComparator();
}
