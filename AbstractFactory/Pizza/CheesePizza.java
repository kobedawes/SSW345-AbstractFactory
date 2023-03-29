package Pizza;
import IngredientFactory.pizzaIngredientFactory;

public class CheesePizza extends Pizza{
    //this.setName("CheesePizza");
    pizzaIngredientFactory ingredientFactory;

    public CheesePizza(pizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    public void prepare(){
        System.out.println("Preparing " + getName() + "\n" );
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
    
}
