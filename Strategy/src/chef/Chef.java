package chef;

import chef.egg_coocker.EggCooker;

public class Chef {
    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook (){
        this.eggCooker.cookEgg();
    }


    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }


}
