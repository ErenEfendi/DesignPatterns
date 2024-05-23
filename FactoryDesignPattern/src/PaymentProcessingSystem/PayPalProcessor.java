package PaymentProcessingSystem;

public class PayPalProcessor implements PaymentProcessor{

	private String transactionId;
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing $"+ amount +" through PayPal");
		this.transactionId = "CC "+System.currentTimeMillis();	
	}

	@Override
	public String getPaymentDetails() {
		return "Transtion successful, ID: "+ transactionId;
	}

}
