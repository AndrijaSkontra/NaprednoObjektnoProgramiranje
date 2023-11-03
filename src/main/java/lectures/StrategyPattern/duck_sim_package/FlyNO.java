package lectures.StrategyPattern.duck_sim_package;

public class FlyNO implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Yo, I can't fly!!!");
    }
}
