public class Main {
    public static void main(String[] args) {
        IFlyBehaviorStrategy iFlyBehaviorStrategy = new JetFlyStrategy(); //created object of interface type and it will refer to specific class which implements this interface
        IQuackBehaviorStrategy iQuackBehaviorStrategy = new SimpleQuackStrategy();

        Context context = new Context(iFlyBehaviorStrategy,iQuackBehaviorStrategy);

        System.out.println(context.applyFlyStrategy()+"/"+context.applyQuackStrategy());
    }
}