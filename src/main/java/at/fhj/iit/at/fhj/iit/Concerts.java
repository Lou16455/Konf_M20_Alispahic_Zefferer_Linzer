package at.fhj.iit;

public class Concerts extends Drink{

    String kind;
    String band;

    public Concerts( String name, String kind, String band) {
        super.name = name;
        this.kind = kind;
        this.band = band;
    }

    /**
     * Creates a Concerts object with given name, e.g. Hip Hop or Jazz
     *
     *
     */

    public String getName(){
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getBand() {
        return band;
    }

    public void printConcerts() {
        System.out.println("The Drink tastes best to a " + kind + " " + name + ". The band is called " + band + ".");
    }
    @Override
    public double getVolume() {
        return 0;
    }
    @Override
    public double getAlcoholPercent() {
        return 0;
    }
    @Override
    public boolean isAlcoholic() {
        return false;
    }

}
