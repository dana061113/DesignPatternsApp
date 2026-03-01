package observer;

public class MobileAppSubscriber implements Observer {

    @Override
    public void update(double usdRate) {
        System.out.println("📱 Мобильді қосымша: Жаңа USD курсы " + usdRate);
    }
}
