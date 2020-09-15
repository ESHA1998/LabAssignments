package Day2;
import java.util.Scanner;
class Vehicle{
	private int noOfWheels;
	private int noOfPassenger;
	private String model;
	private String company;
	
	public Vehicle() {
		
	}

	public Vehicle(int noOfWheels, int noOfPassenger, String model, String company) {
		this.noOfWheels = noOfWheels;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.company = company;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void display() {
		System.out.println("No of wheels: "+ noOfWheels+"noOfPassenger: "+noOfPassenger+"model: "+model+"company: "+company);
	}
}

class Car extends Vehicle
{
	private int noOfDoor;

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public Car(int noOfWheel, int noOfPassenger, String model, String company, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, company);
		this.noOfDoor = noOfDoor;
	}
	public void display() {
		System.out.println("Company = " + this.getCompany());
		System.out.println("Model = " + this.getModel());
		System.out.println("No. of door = " + this.getNoOfDoor());
	}
}

class Convertible extends Car {
	private boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, String model, String company, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, company, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public boolean isHoodOpen() {
		return isHoodOpen;
	}

	public void setHoodOpen(boolean isHoodOpen) {
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		super.display();
		if (isHoodOpen) {
			System.out.println("Hood is open");
		} else {
			System.out.println("Hood is closed");
		}
	}
}

class SportCar extends Car {
	public SportCar(int noOfWheel, int noOfPassenger, String model, String company) {
		super(noOfWheel, noOfPassenger, model, company, 2);
	}
}


public class Overriding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("'1' - to create a Vehicle object.");
		System.out.println("'2' - to create a Car object.");
		System.out.println("'3' - to create a Convertible object.");
		System.out.println("'4' - to create a SportCar object.");
		int choice = sc.nextInt();
		if(choice==1) {
			sc.nextLine();
			System.out.println("Enter company: ");
			String company = sc.nextLine();
			System.out.println("Enter model: ");
			String model =sc.nextLine();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			Vehicle v=new Vehicle(noOfWheel,noOfPassenger,model,company);
			v.display();
		}
		else if(choice == 2) {
			sc.nextLine();
			System.out.println("Enter company: ");
			String company = sc.nextLine();
			System.out.println("Enter model: ");
			String model =sc.nextLine();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			Car c =new Car(noOfWheel,noOfPassenger,model,company,noOfDoor);
			c.display();
		}
		else if(choice == 3) {
			sc.nextLine();
			System.out.println("Enter company: ");
			String company = sc.nextLine();
			System.out.println("Enter model: ");
			String model =sc.nextLine();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			System.out.println("Enter no. of doors: ");
			int noOfDoor=sc.nextInt();
			System.out.println("Hood open? (true/false): ");
			boolean isHoodOpen = sc.nextBoolean();
			Convertible c=new Convertible(noOfWheel,noOfPassenger,model,company,noOfDoor,isHoodOpen);
			c.display();
		}
		else if(choice == 4) {
			sc.nextLine();
			System.out.println("Enter company: ");
			String company = sc.nextLine();
			System.out.println("Enter model: ");
			String model =sc.nextLine();
			System.out.println("Enter no. of wheels: ");
			int noOfWheel=sc.nextInt();
			System.out.println("Enter no. of passengers: ");
			int noOfPassenger=sc.nextInt();
			SportCar s=new SportCar(noOfWheel,noOfPassenger,model,company);
			s.display();
		}
		sc.close();

	}

}
