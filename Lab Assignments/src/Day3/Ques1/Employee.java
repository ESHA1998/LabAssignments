package Day3.Ques1;

import Day3.Ques2.Payable;

abstract public class Employee implements Payable{
	private String name;
	private float salary;
	private int rate;
	public abstract int getWeeklySalary();
	public abstract void setEmployeeRate(int rate);
	
	protected float getSalary() {
		return salary;
	}
	protected void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getRate() {
		return rate;
	}
	protected void setRate(int rate) {
		this.rate = rate;
	}
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name) {
		this.name=name;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee() {
		//Default constructor
	}
	@Override
	public double getPayment() {
		return this.getSalary();
	}
}


