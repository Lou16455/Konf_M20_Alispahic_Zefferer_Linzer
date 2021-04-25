package at.fhj.iit;
public abstract class Concerts extends Drink{

    String kind;
    String band;

    public Concerts( String name) {
        super.name = name;
    }


    /**
     * Creates a Concerts object with given name, e.g. Hip Hop or Jazz
     *
     *
     */



    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void printConcerts() {
        System.out.println("The Drink tastes best to a " + kind + " " + name + ". The band is called " + band + ".");
    }

}
