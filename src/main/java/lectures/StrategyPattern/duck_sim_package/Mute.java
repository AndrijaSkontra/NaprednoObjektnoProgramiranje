package lectures.StrategyPattern.duck_sim_package;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm mute why do you hear me?");
    }
}
