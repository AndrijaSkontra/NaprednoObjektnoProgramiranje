package lectures.StrategyPattern.duck_sim_package;

public class QuackSimple implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Simple quack, QUACK!");
    }
}
