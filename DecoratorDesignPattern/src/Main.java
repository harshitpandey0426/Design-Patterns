public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratorA = new ConcreteDecoratorA(component);
//        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        // Calling the operation on the decorator
        decoratorA.operation();

        // Dynamically adding a new decorator at runtime
        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();

        // Dynamically removing a decorator at runtime
        Component originalComponent = ((Decorator) decoratorB).component;
        originalComponent.operation();
    }
}