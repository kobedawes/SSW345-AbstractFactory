package Pizza;
import IngredientFactory.pizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    pizzaIngredientFactory ingredientFactory;

    public VeggiePizza(pizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    public void prepare(){
        System.out.println("Preparing " + getName()+ "\n");
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
    }
}
