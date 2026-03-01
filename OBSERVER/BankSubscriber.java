package observer;

public class BankSubscriber implements Observer {

    @Override
    public void update(double usdRate) {
        System.out.println("🏦 Банк жүйесі: Валюта курсы " + usdRate + " болып жаңартылды.");
    }
}
