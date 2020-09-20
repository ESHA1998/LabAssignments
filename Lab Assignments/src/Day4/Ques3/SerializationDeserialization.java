package Day4.Ques3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {
	public static void main(String[] args) {
		Address ad=new Address(105,"Sec-14","Gurgaon");
		Employee e=new Employee("Esha","1",ad,10000000);
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("EshaFile.ser")));
			System.out.println("Serialization process");
			e.display();
			oos.writeObject(e);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("EshaFile.ser")));
			Employee emp=(Employee)ois.readObject();
			System.out.println("Deserialization process");
			emp.display();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
