package at.fhj.iit;

import java.util.Date;

/**
 * This class creates food that is compatible with drinks
 *
 *
 */

public class Concerts extends Drink implements SellDrinks{
    /**
     * Uses kind of music, name and band
     *
     *
     */
    String name;
    String kind;
    String band;
    /**
     * Creates a Concerts object with given name, e.g. Hip Hop or Jazz
     *
     *
     */
    public Concerts( String name, String kind, String band) {
        super.name = name;
        this.kind = kind;
        this.band = band;
    }

    @Override
    public double getPrice(Object s) {
        if(s instanceof Snacks){
            return 5;
        }else if (s instanceof Concerts){
            return 600;
        }else if (s instanceof Food){
            return 20;
        }
        return 0;
    }

    @Override
    public Date getDate(Date d) {
        return null;
    }

    @Override
    public String getNamePerson(String o) {
        return null;
    }

    /**
     * returns the band name
     *@return the band name
     *
     */
    public String getName(){
        return name;
    }

    /**
     * returns the music kind
     *@return the music kind
     *
     */
    public String getKind() {
        return kind;
    }

    /**
     * returns the band
     *@return the band
     *
     */
    public String getBand() {
        return band;
    }


    /**
     * prints all the infos
     *
     */

    public void printConcerts() {
        System.out.println("The Drink tastes best to a " + kind + " " + name + ". The band is called " + band + ".");
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
