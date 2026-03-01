package observer;

public class EmailSubscriber implements Observer {

    @Override
    public void update(double usdRate) {
        System.out.println("📧 Email хабарлама: USD курсы өзгерді — " + usdRate);
    }
}
