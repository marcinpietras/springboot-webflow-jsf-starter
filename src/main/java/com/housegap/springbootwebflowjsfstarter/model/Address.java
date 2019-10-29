package com.housegap.springbootwebflowjsfstarter.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * An address entity.
 */
public class Address {

	private String street;

	private String zipCode;

	private String city;

	private Country country;

	private String phone;

	private String email;

	public Address() {
	}

	public Address(String street, String zipCode, String city, Country country) {
		this(street, zipCode, city, country, null, null);
	}

	public Address(String street, String zipCode, String city, Country country, String phone, String email) {
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCity() {
		return city;
	}

	public Country getCountry() {
		return country;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("street", street).append("zipCode", zipCode)
				.append("city", city).append("country", country).append("phone", phone).append("email", email)
				.toString();
	}
}
