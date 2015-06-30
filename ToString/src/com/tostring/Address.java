package com.tostring;

public class Address {

	private final Integer number;
	private final String street;
	private final String city;
	private final String postcode;
	
	public Address(Integer number, String street, String city, String postcode) {
		this.number = number;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}

	public Integer getNumber() {
		return number;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostcode() {
		return postcode;
	}

	// Standard generated toString method
//	@Override
//	public String toString() {
//		return "Address [number=" + number + ", street=" + street + ", city="
//				+ city + ", postcode=" + postcode + "]";
//	}
	
	@Override
	public String toString() {
		return number.toString() + " " + street + ", " + city + ", " + postcode;
	}
}
