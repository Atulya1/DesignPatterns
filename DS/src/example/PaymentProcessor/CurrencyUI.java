package example.adapter.PaymentProcessor;

public class CurrencyUI {
	
	void pay(String currency, double value) {
		PaymentAdapter paymentAdapter = new PaymentAdapter(); 
		System.out.println(paymentAdapter.convertCurrency(currency, value));
	}
	
	public static void main(String args[]) {
		CurrencyUI ui = new CurrencyUI();
		ui.pay("Rupee", 4000.0);
	}

}
