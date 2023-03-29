package Pizza;
import Ingredients.Sauce.*;
import Ingredients.Cheese.*;
import Ingredients.Clams.*;
import Ingredients.Dough.*;
import Ingredients.Pepperoni.*;
import Ingredients.Veggies.*;
import java.util.Arrays;;

public abstract class Pizza{

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies; 
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name){ 
        this.name = name;
    }
    public  String getName(){ 
        return name;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("----" + name + "----  \n");
        if(dough != null){
            result.append(dough);
            result.append("\n");
        }
        if(sauce != null){
            result.append(sauce);
            result.append("\n");
        }
        if(cheese != null){
            result.append(cheese);
            result.append("\n");
        }
        if(veggies != null){
            result.append(Arrays.toString(veggies));
            result.append("\n");
        }
        if(pepperoni != null){
            result.append(pepperoni);
            result.append("\n");
        }
        if(clam != null){
            result.append(clam);
            result.append("\n");
        }
        return result.toString();
    }
}
