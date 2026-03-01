import strategy.*;
import observer.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== STRATEGY PATTERN ===");
        PaymentContext context = new PaymentContext();

        System.out.println("Төлем әдісін таңдаңыз:");
        System.out.println("1 - Банк картасы");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new CreditCardPayment());
                break;
            case 2:
                context.setStrategy(new PayPalPayment());
                break;
            case 3:
                context.setStrategy(new CryptoPayment());
                break;
            default:
                System.out.println("Қате таңдау!");
                return;
        }

        context.executePayment(10000);

        System.out.println("\n=== OBSERVER PATTERN ===");

        CurrencyExchange exchange = new CurrencyExchange();

        Observer mobile = new MobileAppSubscriber();
        Observer email = new EmailSubscriber();
        Observer bank = new BankSubscriber();

        exchange.attach(mobile);
        exchange.attach(email);
        exchange.attach(bank);

        System.out.println("USD курсын енгізіңіз:");
        double newRate = scanner.nextDouble();

        exchange.setUsdRate(newRate);

        scanner.close();
    }
}
