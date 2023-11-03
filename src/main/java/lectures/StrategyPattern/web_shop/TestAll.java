package lectures.StrategyPattern.web_shop;

public class TestAll {

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addToShoppingCard(new PC());
        webShop.addToShoppingCard(new Monitor());

        webShop.getShoppingCard().forEach(item -> {
            item.itemDescription();
            item.itemInfo();
        });

        webShop.setPayment(new Paypal());
        webShop.payInWebShop();
    }
}
