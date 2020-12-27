package testpack;

public class PermanentEmployee extends Employee {
	
	private double basicpay;
	private double hra;
	private int experience;
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		int percentage;
		
		if(experience>=10) {
			percentage=12;
		}
		else if (experience>=0 && experience<5) {
			percentage=5;
		}
		else if (experience>=5 && experience<10) {
			percentage=7;
		}
		else {
			percentage=0;
		}
		
		double salary=basicpay+((basicpay*percentage)/100)+hra;
		
		System.out.println("Permanent Employee: your salary is: " + salary);
	}
}
/*why do we use parameterized constructors if assigning values 
are not allowed and we do it through setters and getters?*/