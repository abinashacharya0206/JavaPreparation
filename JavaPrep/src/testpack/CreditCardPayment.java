package testpack;

public class CreditCardPayment extends RRPaymentServices{

	private static int counter=1;
	private String paymentID;
	static String id;
	{
		//object initialization block
		id="C"+counter;
		counter++;
	}

	private double cashBack;
	private double balanceDue;

	public CreditCardPayment(double balance, int customerID) {
		super(balance, customerID);

	}

	@Override
	void payBill(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Congrats!! You have successfully made a payment of "+ amount+"Your Payment details are: ");
		System.out.println("******************************************************************");

		System.out.println("Customerid: "+super.getCustormerId());
		System.out.println("paymentid: "+ getPaymentID());
		System.out.println("previous due: "+ super.getBalance());
	
		if(amount<super.getBalance()) {
			balanceDue=super.getBalance()-amount;
			System.out.println("Remaining due: "+ balanceDue);
		}
		else {
			System.out.println("Remaining due: "+ 0);
		}
		if(amount>super.getBalance()) {
			cashBack=amount-super.getBalance();
			System.out.println("Cashback: "+ cashBack);
		}
		else {
			System.out.println("Cashback: "+ 0);
		}
		

	
	}

	public String getPaymentID() {
		paymentID=id;
		return paymentID;
		
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public double getCashBack() {
		return cashBack;
	}

	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}

	public double getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}

}
