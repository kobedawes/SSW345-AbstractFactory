package IngredientFactory;
import Ingredients.Sauce.*;
import Ingredients.Cheese.*;
import Ingredients.Clams.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Veggies.*;

 

public interface pizzaIngredientFactory{

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}