package Day3.Ques2;

import Day3.Ques1.CommissionedEmployee;
import Day3.Ques1.Employee;
import Day3.Ques1.HourlyEmployee;
import Day3.Ques1.SalariedEmployee;

public class Tester {
	public static void main(String[] args) {
		Invoice i1 = new Invoice("1", "Product1", 10, 20);
		Invoice i2 = new Invoice("2", "Product2", 4, 100);
		Employee e1 = new SalariedEmployee("Esha", 10000);
		Employee e2 = new HourlyEmployee("Shivanshu", 500, 25);
		Employee e3 = new CommissionedEmployee("Abc", 75, 15000);
		System.out.println("Total payment: " + i1.getPayment() + "\n");
		System.out.println("Total payment: " + i2.getPayment() + "\n");
		System.out.println("Total salary: " + e1.getPayment() + "\n");
		System.out.println("Total salary: " + e2.getPayment() + "\n");
		System.out.println("Total salary: " + e3.getPayment() + "\n");
	}
	
}