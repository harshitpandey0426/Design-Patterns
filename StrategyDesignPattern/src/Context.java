public class Context {
    IFlyBehaviorStrategy flyStrategy;
    IQuackBehaviorStrategy quackStrategy;
    public Context(IFlyBehaviorStrategy flyStrategy, IQuackBehaviorStrategy quackStrategy){
        this.flyStrategy=flyStrategy;
        this.quackStrategy=quackStrategy;
    }
    public String applyFlyStrategy(){
        return flyStrategy.fly();
    }

    public String applyQuackStrategy(){
        return quackStrategy.quack();
    }

}
