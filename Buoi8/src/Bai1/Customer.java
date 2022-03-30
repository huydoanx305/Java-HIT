package Bai1;

public class Customer extends Person{
	private int balance;

	public Customer() {
	}
	
	public Customer(int balance) {
		this.balance = balance;
	}

	public Customer(String name, String address, int balance) {
		super(name, address);
		this.balance = balance;
	}

	@Override
	public void display() {
		System.out.println("Customer name: " + name);
		System.out.println("Customer address: " + address);
		System.out.println("Customer salary: " + balance);
		
	}
	
	
	
}
