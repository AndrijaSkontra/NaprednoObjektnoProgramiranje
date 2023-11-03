package lectures.StrategyPattern.web_shop;

public class PC extends Item{
    @Override
    protected void itemDescription() {
        System.out.println("This is a cool PC");
    }

    @Override
    protected void setPrice(int price) {
        price = 1000;
    }

    @Override
    protected int getPrice() {
        return price;
    }
}
