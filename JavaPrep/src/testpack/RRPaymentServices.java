package testpack;

public abstract class RRPaymentServices {

	private double balance;
	private int customerId;

	public RRPaymentServices(double balance, int customerId) {
		this.balance=balance;
		this.customerId=customerId;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public int getCustormerId() {
		return customerId;
	}

	abstract void payBill(double amount);
	

}

