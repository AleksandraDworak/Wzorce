package visitor;

import activity.Squash;
import activity.Treadmill;
import activity.Weights;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories buried running on treadmill "
                + treadmill.getDistance() * 3);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories buried playing squash "
                + squash.getMinutesPlayed() * 20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories buried lifting weights "
                + weights.getReps() * weights.getWeight() * 2);
    }
}
