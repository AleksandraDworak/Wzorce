package Units;

public class Destroyer {


    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y) {
        this.x = x;
        this.y = y;
        this.stats = UnitStatsRepository.getDestroyerStats();
        this.hpLeft = stats.getHp();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHpLeft() {
        return hpLeft;
    }

    public UnitStats getStats() {
        return stats;
    }
}
