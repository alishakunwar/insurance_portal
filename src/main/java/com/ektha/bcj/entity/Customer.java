package com.ektha.bcj.entity;

public class Customer {

	private String firstName;
	private String lastName;
	private int driverLicense;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(int driverLicense) {
		this.driverLicense = driverLicense;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", driverLicense=" + driverLicense + "]";
	}

}
