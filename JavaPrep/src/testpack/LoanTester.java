package testpack;

public class LoanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan();
		System.out.println(l1.LoanCounter());
		Loan l2=new Loan();
		System.out.println(l2.LoanCounter());
		Loan l3=new Loan(1,1,100,2,5);
		System.out.println(l2.LoanCounter());
		Loan l4=new Loan(2,2,200,3,8);
		System.out.println(l4.LoanCounter());
		

		
	}

}
