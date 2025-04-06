public class AirtelMoneyService implements IPaymentService {
    private String apiKey;

    public AirtelMoneyService(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void sendMoney(String phoneNumber, double amount) {
    System.out.println("the apiKey is : " + apiKey);
    System.out.println("Sending " + amount + "UGX to " + phoneNumber + "via airtel Money. ");
    }
}
