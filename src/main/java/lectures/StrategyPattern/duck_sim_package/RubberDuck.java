package lectures.StrategyPattern.duck_sim_package;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNO();
        this.quackBehavior = new SqueekSound();
        this.swimBehavior = new SwimNO();
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
