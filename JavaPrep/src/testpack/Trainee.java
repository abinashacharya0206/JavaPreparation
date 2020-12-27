package testpack;

public class Trainee implements DataProvider{
	
	private int marksSecured;
	
	public Trainee(int marksSecured) {
		this.marksSecured=marksSecured;
	}

	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub

		float total=(float)marksSecured/totalMaximunMarks;

		
		float percentage=total*100;
		System.out.println("your Percentage is: "+ percentage);
	}

}
