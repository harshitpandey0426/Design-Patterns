import java.util.concurrent.ThreadLocalRandom;

public class ConcreteBalancedProductFactory implements ProductFactory{
    @Override
    public ProductAnimal createAnimal() {
        // let's assume this generates number in a balanced way
        int x = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if(x == 1){
            return new ProductDog();
        }
        if(x == 2){
            return new ProductGoat();
        }

        return new ProductDuck();
    }
}
