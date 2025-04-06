public class MTNMoneyService implements IPaymentService{
    private String clientId;

    public MTNMoneyService(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public void sendMoney(String phoneNumber, double amount) {
        System.out.println("MTN Client ID: " + clientId);
        System.out.println("Sending " + amount + " UGX to " + phoneNumber + " via MTN Mobile Money.");
    }
}
