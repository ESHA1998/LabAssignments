package Day3.Ques1;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
	public HourlyEmployee(String name, int rate,int hoursWorked) {
		super(name,rate);
		super.setSalary(hoursWorked*rate);
		this.hoursWorked=hoursWorked;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public int getWeeklySalary() {
		return (int)this.getSalary()*5;
	}
	public void setEmployeeRate(int rate) {
		this.setRate(rate);
	}
}
