package at.fhj.iit;

public abstract class Food extends Drink{

    String kind;
    String flavour;

    public Food( String name) {
        super.name = name;
    }


    /**
     * Creates a Food object with given name, e.g. ananas or lemon
     *
     *
     */



    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void printFood() {
        System.out.println("The Drink is filled with the " + kind + " " + name + ". It has the flavour " + flavour + ".");
    }

}
