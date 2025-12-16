package week3.day2;

public class Amazon extends CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cash on delivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI Payment");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payment");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking");
	}
public static void main(String[] args) {
	
	Amazon obj= new Amazon();
	obj.cardPayments();
	
}

@Override
void recordPaymentDetails() {
	// TODO Auto-generated method stub
	
}
	

}
