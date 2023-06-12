import java.util.concurrent.ThreadLocalRandom;

public class ConcreteAbstractFactoryA implements AbstractFactory{
    @Override
    public ProductShape createProductShape() {
        int x = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        if(x == 1){
            return new ProductShapeSquare();
        }
        return new ProductShapeRectangle();
    }

    @Override
    public ProductAnimal createProductAnimal() {
        // some random product generation algorithm
        int x = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if(x == 1){
            return new ProductAnimalDog();
        }
        if(x == 2){
            return new ProductAnimalGoat();
        }

        return new ProductAnimalDuck();
    }
}
