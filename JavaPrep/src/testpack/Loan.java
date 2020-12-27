package testpack;

public class Loan {

	private int loanno;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanduration;
	private static int loanCounter=101;
	public static int LoanCounter() {
		loanCounter++;
		return loanCounter;
	}
	public int getLoanno() {
		return loanno;
	}
	public void setLoanno(int loanno) {
		this.loanno = loanno;
	}
	public int getLoanduration() {
		return loanduration;
	}
	public void setLoanduration(int loanduration) {
		this.loanduration = loanduration;
	}
	private float interest;

	public Loan() {

	}
	public static int getLoanCounter() {
		return loanCounter;
	}
	public static void setLoanCounter(int loanCounter) {
		Loan.loanCounter = loanCounter;
	}
	public Loan( int accountNo, int customerNo, float loanAmount,int loanDuration, float interest) {

	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}

}
