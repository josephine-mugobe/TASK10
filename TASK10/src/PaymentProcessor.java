public class PaymentProcessor {
    private IPaymentService paymentService;

    public PaymentProcessor(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processPayment(String Number, double amount) {
        paymentService.sendMoney(Number, amount);
    }
}
