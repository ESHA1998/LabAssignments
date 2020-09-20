package Day4.Ques3;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String id;
	private Address address;
	private transient double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String id, Address address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", address=");
		builder.append(address);
		builder.append("Salary= ");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	public void display() {
		System.out.println(this);
	}
}
