package testpack;

public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RRPaymentServices S1=new ShoppingPayment(2000, 1001);
//		S1.payBill(2000);
//
//		RRPaymentServices S2=new ShoppingPayment(3000, 1002);
//		S2.payBill(3000);
		RRPaymentServices c1=new CreditCardPayment(10000.23, 5001);
		c1.payBill(15000);
	}

}
