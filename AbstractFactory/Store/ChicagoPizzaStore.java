package Store;
import Pizza.*;
import IngredientFactory.*;

public class ChicagoPizzaStore extends pizzaStore{

    protected Pizza createPizza(String item){
        Pizza pizza = null;
        pizzaIngredientFactory ingredientFactory = 
            new ChicagoPizzaIngredientFactory();
        
            if(item.equals("cheese")){
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");    
            }
            else if(item.equals("veggie")){
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");    
            }
            else if(item.equals("clam")){
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");    
            }
            else if(item.equals("pepperoni")){
                pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");    
            }
        pizza.prepare();
        return pizza;
    }

    public static void main(String[] args){
        pizzaStore store = new ChicagoPizzaStore();
        Pizza test = store.createPizza("cheese");
        System.out.println(test.toString());
    }
}
