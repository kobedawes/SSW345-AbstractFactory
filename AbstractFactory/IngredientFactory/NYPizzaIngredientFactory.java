package IngredientFactory;
import Ingredients.Sauce.*;
import Ingredients.Cheese.*;
import Ingredients.Clams.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Veggies.*;

public class NYPizzaIngredientFactory implements pizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Cheese createCheese(){
        return new ReggianoCheese();
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
        return new FreshClams();
    } 
}
