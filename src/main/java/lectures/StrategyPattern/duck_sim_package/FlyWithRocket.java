package lectures.StrategyPattern.duck_sim_package;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying using rocket, git good!");
    }
}
