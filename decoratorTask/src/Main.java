import Meal.*;
import MealDecorator.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceDecorator(new ChickenDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();




    }

}
