abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Decorator: before operation");
        component.operation();
        System.out.println("Decorator: after operation");
    }
}

