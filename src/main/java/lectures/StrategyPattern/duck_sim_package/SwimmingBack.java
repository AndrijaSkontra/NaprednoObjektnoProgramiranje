package lectures.StrategyPattern.duck_sim_package;

public class SwimmingBack implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("Swimming back, WATCH OUT!");
    }
}
