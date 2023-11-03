package lectures.StrategyPattern.web_shop;

import java.util.ArrayList;

public class WebShop {

    Payment payment;
    ArrayList<Item> shoppingCard;
    int fullPrice;

    public WebShop() {
        this.shoppingCard = new ArrayList<>();
        this.fullPrice = 0;
    }

    private int calculateFullPrice() {
        System.out.println("Calculating full price...");
        int fullPrice = 0;
        for (Item item : shoppingCard) {
            fullPrice += item.getPrice();
        }
        System.out.println("Full price is " + fullPrice);
        return fullPrice;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
        System.out.println("Payment method set to " + payment.getClass().getSimpleName());
    }

    public void payInWebShop() {
        payment.pay(fullPrice);
        shoppingCard.clear();
    }

    public void addToShoppingCard(Item item) {
        shoppingCard.add(item);
        fullPrice = calculateFullPrice();
    }

    public ArrayList<Item> getShoppingCard() {
        return shoppingCard;
    }
}
