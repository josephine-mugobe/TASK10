public class Main {
    public static void main(String[] args) {

        IPaymentService airtelService = new AirtelMoneyService("AIR123456");
        PaymentProcessor airtelProcessor = new PaymentProcessor(airtelService);
        airtelProcessor.processPayment("O7O2773085", 1000000);
    }
}