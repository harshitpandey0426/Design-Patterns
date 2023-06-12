public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteAbstractFactoryA();
        ProductAnimal productAnimal = abstractFactory.createProductAnimal();
        ProductShape productShape = abstractFactory.createProductShape();

        System.out.println(productShape.selectShape());
        System.out.println(productAnimal.selectAnimal());
    }
}