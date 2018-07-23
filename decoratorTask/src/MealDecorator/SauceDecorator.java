package MealDecorator;

import Meal.Meal;

public class SauceDecorator extends MealDecorator {


    public SauceDecorator(Meal decoratedmeal) {
        super(decoratedmeal);
    }

    void addSauce (){
        System.out.println("adding sauce...");

    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}
