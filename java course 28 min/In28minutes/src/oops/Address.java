package oops;

public class Address {

	private String street;
	private String city;
	private int pinCode;
	private String state;
	public Address(String street, String city, int pinCode, String state) {
		super();
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + ", state=" + state + "]";
	}
	
	
}
