package testpack;

public class ContractEmplyee extends  Employee {
	private int hours;
	private double wages;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}

	public void calculateSalary() {
		double salary=hours*wages;	
		System.out.println("Contract Employee: your salary is: " + salary);
	}



}
