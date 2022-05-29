package example.adapter.PaymentProcessor;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public double pay(double currency) {
		double tax = 4.5;
		currency = currency + (currency*tax)/100;
		return currency;
	}

}
