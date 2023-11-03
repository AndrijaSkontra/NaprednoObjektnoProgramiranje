package lectures.StrategyPattern.web_shop;

public class Paypal implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with Paypal.");
    }
}
