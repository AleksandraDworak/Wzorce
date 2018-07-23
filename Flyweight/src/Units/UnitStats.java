package Units;

public class UnitStats {
    private String name;
    private int hp;
    private int armor;
    private int dmg;
    private int speed;
    private int resouruceCost;

    public UnitStats(String name, int hp, int armor, int dmg, int speed, int resouruceCost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.dmg = dmg;
        this.speed = speed;
        this.resouruceCost = resouruceCost;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getDmg() {
        return dmg;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResouruceCost() {
        return resouruceCost;
    }
}
