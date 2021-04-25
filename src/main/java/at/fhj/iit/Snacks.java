package at.fhj.iit;
public  class Snacks extends Drink{
    String texture;
    String taste;
    public Snacks( String name, String texture, String taste) {
        super.name = name;
        this.texture = texture;
        this.taste = taste;
    }

    /**
     * Creates a Snacks object with given name, e.g. chips or chocolate
     *
     *
     */
    public String getName(){
        return super.name;
    }

    public String getTexture() {
        return texture;
    }
    public String getTaste() {
        return taste;
    }
    public void printSnacks() {
        System.out.println("The best snack to your Drink is " + name + ". It tastes " +taste + " and is " + texture + ".");
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