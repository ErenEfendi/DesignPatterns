package PaymentProcessingSystem;

public interface PaymentProcessor {

	void processPayment(double amount);
	
	String getPaymentDetails();
}
