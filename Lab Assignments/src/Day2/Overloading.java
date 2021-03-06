package Day2;

public class Overloading {
	private String name;
	private String id;
	private double grade;

	public Overloading(String name, String id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public Overloading(String name, String id) {
		this(name, id, -1.0);
	}

	public Overloading(String id) {
		this("", id, -1.0);
	}

	public void display() {
		if (!name.equals(""))
			System.out.println("Name = " + name);
		System.out.println("ID = " + id);
		if (grade != -1.0)
			System.out.println("Grade = " + grade);
	}

	public void display(int year) {
		display();
		System.out.println("Year = " + year);
	}

}
