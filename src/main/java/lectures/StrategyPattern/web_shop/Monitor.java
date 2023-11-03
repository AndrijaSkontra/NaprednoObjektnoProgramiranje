package lectures.StrategyPattern.web_shop;

public class Monitor extends Item{
    @Override
    protected void itemDescription() {
        System.out.println("This is a cool monitor");
    }

    @Override
    protected void setPrice(int price) {
        price = 100;
    }

    @Override
    protected int getPrice() {
        return price;
    }
}
