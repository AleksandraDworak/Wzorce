package Units;

public class Tank {
    private int hpLeft;
    private int x;
    private int y;
    private UnitStats stats;

    public Tank(int x, int y) {

        this.x = x;
        this.y = y;
        this.stats = UnitStatsRepository.getTankStats();
        this.hpLeft = stats.getHp();
    }
}

