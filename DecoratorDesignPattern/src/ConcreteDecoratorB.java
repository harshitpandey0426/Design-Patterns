class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorB: before operation");
        super.operation();
        System.out.println("ConcreteDecoratorB: after operation");
    }
}
