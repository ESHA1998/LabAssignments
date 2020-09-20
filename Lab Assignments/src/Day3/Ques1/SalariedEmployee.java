package Day3.Ques1;

public class SalariedEmployee extends Employee{
	public SalariedEmployee(String name, float salary) {
		super(name,salary);
		super.setRate((int)salary/4);
	}
	public int getWeeklySalary() {
		return (int)this.getSalary()/4;
	}
	public void setEmployeeRate(int rate) {
		this.setRate(rate);
	}
}