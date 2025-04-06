public class AirtelMoneyService implements IPaymentService {
    private String apiKey;

    public AirtelMoneyService(String apiKey) {
        this.apiKey = apiKey;
    }
}
