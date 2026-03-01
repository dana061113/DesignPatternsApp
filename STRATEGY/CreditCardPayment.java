package strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Төлем " + amount + " тг банк картасы арқылы орындалды.");
    }
}
