package at.fhj.iit;

/**
 * this class creates a snacks object
 *
 */
public  class Snacks extends Drink{

    /**
     * uses texture and taste
     *
     *
     */

    String texture;
    String taste;

    /**
     * Creates a Snacks object with given name, e.g. chips or chocolate
     *
     *
     */
    public Snacks( String name, String texture, String taste) {
        super.name = name;
        this.texture = texture;
        this.taste = taste;
    }

    /**
     * returns the snacks name
     *@return the snacks name
     *
     */

    public String getName(){
        return super.name;
    }
    /**
     * returns the snacks texture
     *@return the snacks texture
     *
     */
    public String getTexture() {
        return texture;
    }

    /**
     * returns the snacks taste
     *@return the snacks taste
     *
     */
    public String getTaste() {
        return taste;
    }

    /**
     * prints the snacks
     *
     */

    public void printSnacks() {
        System.out.println("The best snack to your Drink is " + name + ". It tastes " +taste + " and is " + texture + ".");
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