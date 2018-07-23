package smart_app;

public class SmartApp {
    private double version;

    public void changeVersion(double version) {
        this.version = version;
        System.out.println("nowa wersja : " + this.version);

    }


    public SmartAppMemento save() {
        return new SmartAppMemento(this.version);
    }


    public void load(SmartAppMemento smartAppMemento) {
        this.version = smartAppMemento.getVersion();

    }
}

