package at.fhj.iit;

/**
 * This class creates food that is compatible with drinks
 *
 *
 */

public class Food extends Drink{
    /**
     * uses kind and flavour
     */
    String kind;
    String flavour;

    /**
     * Creates a Food object with given name, e.g. ananas or lemon
     *
     *
     */

    public Food( String name, String flavour, String kind) {
        super.name = name;
        this.kind = kind;
        this.flavour = flavour;

    }

    /**
     * returns the food name
     *@return the food name
     *
     */

    public String getName(){
        return super.name;
    }

    /**
     * returns the food kind
     *@return the food kind
     *
     */

    public String getKind() {
        return kind;
    }

    /**
     * returns the food flavour
     *@return the food flavour
     *
     */

    public String getFlavour() {
        return flavour;
    }

    /**
     * prints the food
     *
     */

    public void printFood() {
        System.out.println("The Drink is filled with the " + kind + " " + name + ". It has the flavour " + flavour + ".");
    }

    /**
     * Drink features from the superclass
     *
     *
     */

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