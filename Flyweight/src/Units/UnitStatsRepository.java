package Units;

public class UnitStatsRepository {
    private static UnitStats tankStats = new UnitStats("Tank", 200, 200, 50, 15, 50);
    private static UnitStats destroyerStats = new UnitStats("Destroyer", 200, 200, 50, 15, 50);
    private static UnitStats riflemanStats = new UnitStats("Rifleman",200, 200, 50, 15, 50);


    private UnitStatsRepository(){}

    public static UnitStats getTankStats(){
        return tankStats;
    }

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getRiflemanStats(){
        return riflemanStats;
    }


}
