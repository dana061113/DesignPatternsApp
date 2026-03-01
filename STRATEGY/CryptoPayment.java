package strategy;

public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Төлем " + amount + " тг криптовалюта арқылы орындалды.");
    }
}
