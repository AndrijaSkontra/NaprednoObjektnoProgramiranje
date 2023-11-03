package lectures.StrategyPattern.duck_sim_package;

public class SwimNO implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("I'm drowning help!!!!!");
    }
}
