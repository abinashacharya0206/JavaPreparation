package testpack;

public class Employee {

	private int employeeid;
	private String name;
	private double salary;


	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmployeeId(int employeeid) {
		this.employeeid=employeeid;
	}
	public int getEmployeeId() {
		return employeeid;
	}

}
