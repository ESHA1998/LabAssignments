package Day3.Ques1;

public class CommissionedEmployee extends Employee {
	private int percentageSales;
	private int weeklySales;
	public CommissionedEmployee(String name,int percentageSales,int weeklySales) {
		super(name);
		super.setSalary((percentageSales*weeklySales)/100);
		super.setRate(percentageSales);
	}
	
	public int getPercentageSales() {
		return percentageSales;
	}

	public int getWeeklySales() {
		return weeklySales;
	}

	public int getWeeklySalary() {
		return (int)this.getSalary();
	}
	
	public void setEmployeeRate(int rate) {
		this.setRate(rate);
	}
}
