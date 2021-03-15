package at.fhj.iit;

public abstract class Snacks extends Drink{
    String texture;
    String taste;

    public Snacks( String name) {
        super.name = name;
    }


    /**
     * Creates a Snacks object with given name, e.g. chips or chocolate
     *
     *
     */



    public String getTexture() {

        return texture;
    }

    public void setTexture(String texture) {

        this.texture = texture;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {

        this.taste = taste;
    }

    public void printSnacks() {
        System.out.println("The best snack to your Drink is " + name + ". It tastes " +taste + " and is " + texture + ".");
    }
}
