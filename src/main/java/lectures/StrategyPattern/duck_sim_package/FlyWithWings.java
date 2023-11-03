package lectures.StrategyPattern.duck_sim_package;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duckie using wings yeah!");
    }
}
