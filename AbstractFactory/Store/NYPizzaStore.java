package Store;
import Pizza.*;
import IngredientFactory.*;

//import IngredientFactory.NYPizzaIngredientFactory;


public class NYPizzaStore extends pizzaStore{

    protected Pizza createPizza(String item){
        Pizza pizza = null;
        pizzaIngredientFactory ingredientFactory = 
            new NYPizzaIngredientFactory();
        
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");    
        }
        else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");    
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");    
        }
        else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");    
        }
        pizza.prepare();
        return pizza;
    }

    public static void main(String[] args){
        // pizzaStore store = new NYPizzaStore();
        // Pizza test = store.createPizza("cheese");
        // System.out.println(test.toString());
    }
}
