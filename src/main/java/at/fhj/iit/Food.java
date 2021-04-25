package at.fhj.iit;

public class Food extends Drink{

    String kind;
    String flavour;

    public Food( String name, String flavour, String kind) {
        super.name = name;
        this.kind = kind;
        this.flavour = flavour;

    }

    /**
     * Creates a Food object with given name, e.g. ananas or lemon
     *
     *
     */
    public String getName(){
        return super.name;
    }

    public String getKind() {
        return kind;
    }

    public String getFlavour() {
        return flavour;
    }

    public void printFood() {
        System.out.println("The Drink is filled with the " + kind + " " + name + ". It has the flavour " + flavour + ".");
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