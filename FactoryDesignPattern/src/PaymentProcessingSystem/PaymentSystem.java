package PaymentProcessingSystem;

import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter payment type : creditcard, paypal, banktransfer");
		String paymentType = scn.nextLine().toUpperCase();
		System.out.println("Enter amount: ");
		double amount = scn.nextDouble();
		
		PaymentProcessorFactory f = new PaymentProcessorFactory();
		PaymentProcessor p = f.getPaymentProcessor(paymentType);
		if(p != null) {
			p.processPayment(amount);
			System.out.println(p.getPaymentDetails());
		}
	}

}
