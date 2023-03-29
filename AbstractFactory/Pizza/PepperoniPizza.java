package Pizza;
import IngredientFactory.pizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    pizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(pizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    public void prepare(){
        System.out.println("Preparing " + getName() + "\n");
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
