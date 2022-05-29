package example.adapter.PaymentProcessor;

public class PaymentAdapter {
	double convertCurrency(String currency, double value) {
		double convertedValue = 0.0;
		if(currency.equals("Dollar")) {
			convertedValue = value/74;
		} else if(currency.equals("Rupee")) {
			convertedValue = value*74;
		}
		
		PaymentProcessor impl = new PaymentProcessorImpl();
		return impl.pay(convertedValue);
	}

}
