package Store;
import Pizza.*;

public class AbstractFactory{


    public static void main(String[] args) {

        pizzaStore store = new NYPizzaStore();
        Pizza test = store.createPizza("cheese");
        System.out.println(test.toString());

        pizzaStore chiStore = new ChicagoPizzaStore();
        Pizza cTest = chiStore.createPizza("veggie");
        System.out.println(cTest.toString());

        pizzaStore store2 = new NYPizzaStore();
        Pizza test2 = store2.createPizza("pepperoni");
        System.out.println(test2.toString());

        pizzaStore chiStore2 = new ChicagoPizzaStore();
        Pizza cTest2 = chiStore2.createPizza("clam");
        System.out.println(cTest2.toString());
    }
}
