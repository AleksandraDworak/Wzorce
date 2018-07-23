import chef.Chef;
import chef.egg_coocker.HardBoiledEggCoocker;
import chef.egg_coocker.SoftBoiledEggCoocker;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon");
        chef.setEggCooker(new SoftBoiledEggCoocker());
        chef.cook();
        chef.setEggCooker(new HardBoiledEggCoocker());
        chef.cook();





    }

}
