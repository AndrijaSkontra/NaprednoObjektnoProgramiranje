package lectures.StrategyPattern.duck_sim_package;

public class WildDuck extends Duck{

    public WildDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackSimple();
        this.swimBehavior = new SwimmingBack();
    }

    @Override
    protected void performFlying() {
        flyBehavior.fly();
    }

    @Override
    protected void performQuack() {
        quackBehavior.quack();
    }

    @Override
    protected void performSwim() {
        swimBehavior.swim();
    }
}
