package lectures.StrategyPattern.duck_sim_package;

public class SqueekSound implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SQUEEEEEEWEKKKKK! SQUEEEEEEEKKKKKK");
    }
}
