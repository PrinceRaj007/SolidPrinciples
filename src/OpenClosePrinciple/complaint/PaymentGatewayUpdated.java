package OpenClosePrinciple.complaint;
/*This Example follow OPEN for EXTENSION and CLOSE for MODIFICATION principle. In this case if new payment method
for example DEBIT_CARD has to be included then original PaymentMethod class needs not to be modified. Every time we 
need to add new payment method we just have to implement the PaymentMethod interface and implement pay() mehthod
and there will be no need to modify existing classes following OCP. */
class PaymentGatewayUpdatedDriver{
	public static void main(String[] args) {
		PaymentGateway paymentGateway = new PaymentGateway();
		paymentGateway.processPayment(new Upi(), 20.0);
		paymentGateway.processPayment(new NetBanking(), 56000.0);
	}
}
class PaymentGateway {
	public void processPayment(PaymentMethod paymentMethod, Double amount){
		paymentMethod.pay(amount);		
	}
}
interface PaymentMethod {
	public void pay(Double amount);
}
class Upi implements PaymentMethod{
	@Override
	public void pay(Double amount) {
		System.out.println("Payment  was successfully done using UPI !! ");		
	}
}
class CreditCard implements PaymentMethod{
	@Override
	public void pay(Double amount) {
		System.out.println("Payment  was successfully done using CREDIT_CARD !! ");		
	}
}
class NetBanking implements PaymentMethod{
	@Override
	public void pay(Double amount) {
		System.out.println("Payment  was successfully done using NET_BANKING !! ");		
	}
}