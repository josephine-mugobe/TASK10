public class PaymentProcessor {
    private IPaymentService paymentService;

    public PaymentProcessor(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processPayment(String recipient, double amount) {
        paymentService.sendMoney(recipient, amount);
    }
}
