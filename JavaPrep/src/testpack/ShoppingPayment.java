package testpack;

public class ShoppingPayment extends RRPaymentServices{
	
	private static int counter=1;
	private String paymentID;
	static String id;
	{
		//object initialization block
		id="S"+counter;
		counter++;
	}
	
	public ShoppingPayment(double balance, int customerID) {
		super(balance, customerID);
		//how to call the parent constructor
		///do we need to declare a variable in the class if it is passed into the constructor but is present in the parent class
	}


	public String getPaymentID() {
		paymentID=id;
		return paymentID;
	}
	@Override
	public void payBill(double amount) {
		double rem=super.getBalance()-amount;
		if(amount==super.getBalance()) {
		System.out.println("Congrats!! You have successfully made a payment of "+ amount+"Your Payment details are: ");
		System.out.println("******************************************************************");
		
		System.out.println("Customerid: "+super.getCustormerId());
		System.out.println("paymentid: "+ getPaymentID());
		System.out.println("previous due: "+ super.getBalance());
		System.out.println("Remaining due: "+ rem);
		
		
		}
		else {
			System.out.println("Amount Entered is incorrect");
		}
		
	}
	
	

}
