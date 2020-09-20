package Day4.Ques3;

import java.io.Serializable;

public class Address implements Serializable{
	private int houseNo;
	private String colony;
	private String city;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int houseNo, String colony, String city) {
		this.houseNo = houseNo;
		this.colony = colony;
		this.city = city;
	}
	public Address() {}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [houseNo=");
		builder.append(houseNo);
		builder.append(", colony=");
		builder.append(colony);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
