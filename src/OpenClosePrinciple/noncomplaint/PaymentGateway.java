package OpenClosePrinciple.noncomplaint;

/*This Example does not follow OPEN for EXTENSION and CLOSE for MODIFICATION principle. In this case if new payment method
  for example DEBIT_CARD has to be included then original PaymentMethod old class has to be modified. Every time we 
  need to add new payment method we end up modifying the existing class which is against OCP. Java program should be close to
   modification and open to extension*/
class PaymentGatewayDriver{
	public static void main(String[] args) {
		PaymentGateway gateway = new PaymentGateway();
		gateway.processPayment("CREDIT_CARD", 20.2);
	}
}
class PaymentGateway {
	public void processPayment(String paymentMethod, Double amount) {
		if(paymentMethod.equals("UPI")) {
			System.out.println("Payment  was successfully done using UPI !! ");
		}else if(paymentMethod.equals("CREDIT_CARD")) {
			System.out.println("Payment  was successfully done using CREDIT CARD !! ");
		}else if(paymentMethod.equals("NET_BANKING")){
			System.out.println("Payment  was successfully done using NET_BANKING !! ");
		}else {
			System.out.println("Payment  was not supported !! ");
		}
	}
}
