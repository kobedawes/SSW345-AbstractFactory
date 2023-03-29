package Pizza;
import IngredientFactory.pizzaIngredientFactory;

public class ClamPizza extends Pizza{
    pizzaIngredientFactory ingredientFactory;

    public ClamPizza(pizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    public void prepare(){
        System.out.println("Preparing " + getName() + "\n");
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.clam = ingredientFactory.createClam();
    }
}