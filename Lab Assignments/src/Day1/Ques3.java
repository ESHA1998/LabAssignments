package Day1;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students");
		Scanner s=new Scanner(System.in);
		int numStudents=s.nextInt();
		int i=numStudents;
		int sum=0;
		while(i>0) {
			System.out.println("Enter the grade for student "+(numStudents-i+1)+" :");
			s=new Scanner(System.in);
			int marks=s.nextInt();
			if(marks<0 || marks>100) {
				System.out.println("Invalid marks, try again");
			}else {
				sum+=marks;
				i--;
			}
		}
		int average=sum/numStudents;
		System.out.println("The average is: "+average);
		
	}

}
