import Units.Destroyer;
import Units.Rifleman;
import Units.Tank;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object>activeUnits = new ArrayList<>();

        for (int i = 0; i<100000; i++){
            activeUnits.add(new Tank (0,0));
            activeUnits.add(new Rifleman(1,0));
            activeUnits.add(new Destroyer(0,0));
        }

        System.out.println(activeUnits);



    }



}
