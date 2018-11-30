package week3.prog1;

public class Customer {
	String firstName, lastName, socSecurityNum;
	Address billingAddress;
	Address shippingAddress;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Customer(String firstName, String lastName, String socSecurityNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}

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

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	@Override
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}

	public static void main(String[] args) {

		Address add1 = new Address("100North", "Fairfield", "IA", "55254");
		Address add2 = new Address("10North", "Chicago", "IL", "65254");
		Address add3 = new Address("Brookl", "New York", "NY", "84254");
		Address add4 = new Address("403st", "Los Angeles", "CA", "55254");
		Address add5 = new Address("David St", "Chicago", "IL", "65254");

		Customer cust1 = new Customer("Chris", "Angel", "42324");
		Customer cust2 = new Customer("Dave", "Angel", "542324");
		Customer cust3 = new Customer("Hope", "Dawit", "62324");
		Customer cust4 = new Customer("Veronica", "Silva", "842324");

		cust1.setBillingAddress(add1);
		cust1.setShippingAddress(add1);

		cust2.setBillingAddress(add2);
		cust2.setShippingAddress(add2);

		cust3.setBillingAddress(add3);
		cust3.setShippingAddress(add3);

		cust4.setBillingAddress(add4);
		cust4.setShippingAddress(add4);

		Customer[] customers = new Customer[3];
		customers[0] = cust1;
		customers[1] = cust2;
		customers[2] = cust3;

		for (Customer c : customers) {
			if (c.getBillingAddress().getCity().equals("Chicago"))
				System.out.println(c);
		}
	}

}
