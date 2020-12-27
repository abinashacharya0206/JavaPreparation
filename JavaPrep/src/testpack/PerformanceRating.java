package testpack;

public class PerformanceRating {
	private final static int outstanding=5;
	private final static int good=4;
	private final static int average=3;
	private final static int poor=2;

	public static void calculatePerformance(Employeefinal Employee) {
		int rating = 0;
		if(Employee.getPoint()>=1 && Employee.getPoint() <=49) {
			rating=poor;
		}
		else if(Employee.getPoint()>=50 && Employee.getPoint() <=59) {
			rating=average;
		}
		else if(Employee.getPoint()>=60 && Employee.getPoint() <=79) {
			rating=good;
		}
		else if(Employee.getPoint()>=80 && Employee.getPoint() <=100) {
			rating=outstanding;
		}
		else {
			System.out.println("Something went wrong");
		}
		System.out.println("your rating is : "+ rating);


	}
}