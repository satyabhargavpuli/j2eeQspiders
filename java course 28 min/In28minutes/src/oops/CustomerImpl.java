package oops;

public class CustomerImpl {

	public static void main(String[] args) {
		Customer customer = new Customer("shiv", new Address("near seetha ramanjaneya appartment", "hyd", 500049, "telengana"));
		System.out.println(customer);
		
		customer.setOfficeAddress(new Address("raheja mind space", "hyd", 500024, "telengana"));
		System.out.println(customer.getOfficeAddress());	
	}
}
