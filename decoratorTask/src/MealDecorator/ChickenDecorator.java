package MealDecorator;

import Meal.*;

public class ChickenDecorator extends MealDecorator {


    public ChickenDecorator(Meal decoratedmeal) {
        super(decoratedmeal);
    }

    void addChicken (){
        System.out.println("adding chicken...");

    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
}
