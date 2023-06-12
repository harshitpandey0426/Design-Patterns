public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory1 = new ConcreteRandomProductFactory();
        ProductFactory productFactory2 = new ConcreteBalancedProductFactory();

        ProductAnimal productAnimal1 = productFactory1.createAnimal();
        ProductAnimal productAnimal2 = productFactory2.createAnimal();

        System.out.println(productAnimal1.selectAnimal());
        System.out.println(productAnimal2.selectAnimal());
    }
}