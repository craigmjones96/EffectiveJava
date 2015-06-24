package com.hashcode;

public class HouseDetails {

	private final short houseNumber;
	private final String streetName;
	private final short numberOfFloors;
	private final long houseIdentificationNumber;
	
	public HouseDetails(short houseNumber, String streetName, 
			short numberOfFloors, long houseIdentificationNumber) {
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.numberOfFloors = numberOfFloors;
		this.houseIdentificationNumber = houseIdentificationNumber;
	}

	// Automatically generated equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ (int) (houseIdentificationNumber ^ (houseIdentificationNumber >>> 32));
		result = prime * result + houseNumber;
		result = prime * result + numberOfFloors;
		result = prime * result
				+ ((streetName == null) ? 0 : streetName.hashCode());
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
		HouseDetails other = (HouseDetails) obj;
		if (houseIdentificationNumber != other.houseIdentificationNumber)
			return false;
		if (houseNumber != other.houseNumber)
			return false;
		if (numberOfFloors != other.numberOfFloors)
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}
	
	// My attempts at equals and hashcode
//	@Override
//	public int hashCode() {
//		int value = 31;
//		int result = 17;
//		
//		result = value * result + (int) houseNumber;
//		result = value * result + ((streetName==null) ? 0 : streetName.hashCode());
//		result = value * result + (int) numberOfFloors;
//		result = value * result + (int) (houseIdentificationNumber ^ (houseIdentificationNumber >>> 32));
//		
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj)
//			return true;
//		if(obj == null)
//			return false;
//		if(!(obj instanceof HouseDetails))
//			return false;
//		HouseDetails details = (HouseDetails) obj;
//		if(details.houseNumber!=houseNumber)
//			return false;
//		if(details.streetName==null && streetName!=null) {
//				return false;
//		}
//		else if(!details.streetName.equals(streetName)) {
//				return false;
//		}
//		if(details.numberOfFloors!=numberOfFloors)
//			return false;
//		if(details.houseIdentificationNumber!=houseIdentificationNumber)
//			return false;
//		return true;
//	}
	
}
