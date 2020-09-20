package Day4.Ques4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while(true){
			try {
				System.out.println("Enter the number. Print -1 to exit");
				number = sc.nextInt();
				if(number==-1) {
					break;
				}
				if (number % 2 == 0) {
					System.out.println("Even number");
				} else if (number % 2 != 0) {
					System.out.println("Odd number");
				}
			}catch(InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();
			}
		}
		sc.close();
	}
}
