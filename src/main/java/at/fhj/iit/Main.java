package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);


        Food f = new Food("ananas") {
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
        };
        f.setFlavour("sweet-sour");
        f.setKind("fruit");
        f.printFood();


        Snacks s = new Snacks ("chips", "crispy", "salty") {
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
        };
        s.printSnacks();

        Concerts c = new Concerts ("concert") {
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
        };
        c.setKind("Jazz");
        c.setBand("Herbie Hancock");
        c.printConcerts();
    }
}
