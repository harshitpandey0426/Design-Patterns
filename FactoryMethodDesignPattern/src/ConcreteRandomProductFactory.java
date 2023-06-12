
import java.util.concurrent.ThreadLocalRandom;

public class ConcreteRandomProductFactory implements ProductFactory{

    @Override
    public ProductAnimal createAnimal() {
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
