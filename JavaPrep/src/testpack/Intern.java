package testpack;

public class Intern implements DataProvider{
	
	private int marksSecured;
	private int graceMarks;
	
	public Intern(int marksSecured, int graceMarks) {
		this.marksSecured=marksSecured;
		this.graceMarks=graceMarks;
	}

	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub
		float totalMarks=this.marksSecured+this.graceMarks;
		float percentage=(float)totalMarks/totalMaximunMarks*100;
		System.out.println("your Percentage is: "+ percentage);
	}

}
