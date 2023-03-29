package IngredientFactory;
import Ingredients.Sauce.*;
import Ingredients.Cheese.*;
import Ingredients.Clams.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Veggies.*;

public class ChicagoPizzaIngredientFactory implements pizzaIngredientFactory{
    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoeSauce();
    }
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggies(){
        Veggies[] veggies = {new Garlic(), new Onion(), 
            new Mushroom(), new RedPepper()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    public Clam createClam(){
        return new FrozenClams();
    }
}
