public class MTNMoneyService implements IPaymentService{
    private String clientId;

    public MTNMoneyService(String clientId) {
        this.clientId = clientId;
    }
}
