public class PaymentProcessor {
    private IPaymentService paymentService;

    public PaymentProcessor(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
