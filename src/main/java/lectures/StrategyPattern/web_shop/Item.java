package lectures.StrategyPattern.web_shop;

public abstract class Item {

    protected int price;

    public void itemInfo() {
        System.out.println("This is some random info every item has.");
    }

    protected abstract void itemDescription();

    protected abstract void setPrice(int price);

    protected abstract int getPrice();
}
