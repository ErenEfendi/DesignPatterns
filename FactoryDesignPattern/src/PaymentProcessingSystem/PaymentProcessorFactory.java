package PaymentProcessingSystem;

public class PaymentProcessorFactory {

	public PaymentProcessor getPaymentProcessor(String type) {
		if(type.equals("CREDITCARD")) {
			return new CreditCardProcessor();
		}
		else if(type.equals("PAYPAL")){
			return new PayPalProcessor();
		}
		else if(type.equals("BANKTRANSFER")) {
			return new BankTransferProcessor();
		}
		return null;
	}
}
