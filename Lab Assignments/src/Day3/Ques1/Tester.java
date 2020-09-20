package Day3.Ques1;

import java.util.ArrayList;
import java.util.List;
public class Tester {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		Employee e1=new SalariedEmployee("esha",100000);
		employees.add(e1);
		HourlyEmployee e2=new HourlyEmployee("shivanshu",20,0);
		e2.getHoursWorked();
		employees.add(e2); 
		System.out.println(employees.get(1).getRate()); 
		CommissionedEmployee e3=new CommissionedEmployee("abc",73,2222);
		e3.setEmployeeRate(32);
		System.out.println(e3.getRate());
	}

}
