package MealDecorator;

import Meal.Meal;

public class ShrimpDecorator extends MealDecorator {


    public ShrimpDecorator(Meal decoratedmeal) {
        super(decoratedmeal);
    }

    void addShrimp (){
        System.out.println("adding shrimp...");

    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
}
