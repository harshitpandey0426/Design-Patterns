class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorA: before operation");
        logOperation();
        super.operation();
        logOperation();
        System.out.println("ConcreteDecoratorA: after operation");
    }

    private void logOperation() {
        System.out.println("ConcreteDecoratorA: Logging operation");
    }
}
