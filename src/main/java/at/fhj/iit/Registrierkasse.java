package at.fhj.iit;

import java.util.Date;
/**
 cash register class for the protocol  of the prices, date and cashier
 */

public class Registrierkasse {

    /**
     * two dates, because our two-day-event
     */
    private Date date = new Date();
    private Date date1 = new Date();
    private Snacks s;
    private Concerts c;
    private Food f;

    public Date getDate() {
        return date;
    }

    public Date getDate1() {
        return date1;
    }

    public Snacks getS() {
        return s;
    }

    public Concerts getC() {
        return c;
    }

    public Food getF() {
        return f;
    }

    public Registrierkasse(){
       date.setYear(2020);
       date.setMonth(4);
       date1 = new Date(System.currentTimeMillis());
       s =  new Snacks("chips", "crispy", "salty");
       c = new Concerts("Heidi", "rap", "Heidi-Band");
       f = new Food("ananas", "sour", "fruit");
    }
    /**
     @param date and name of the person
     @return total sales of a person
     */
    public double personSalesDate(String name, Date date){


        switch (name){
            case "Chiara":
                return totalSales(s, date);

            case "Lukas":

                return totalSales(c, date);

            case "Sadzida":
                return totalSales(f, date);
        }
        return 0;
    }


    /**
     @param name of the person
     @return total sales of a person
     */
    public double personSales(String name){

        switch (name){
            case "Chiara":
                return totalSalesSnacks();

            case "Lukas":
                return totalSalesConcert();

            case "Sadzida":
                return totalSalesFood();
        }
        return 0;
    }

    /**
     @param date
     @return total sales of a date
     */
    public double salesDate(Date date, Snacks s, Food f, Concerts c){
        return totalSales(s, date) + totalSales(f, date)+ totalSales(c, date);
    }

    /**
     @return total sales of non alcoholic drinks
     */
    public double totalSalesFood(){

        return totalSales(f, date) + totalSales(f, date1);
    }

    /**
     @return total sales of weak drinks
     */
    public double totalSalesConcert(){

        return totalSales(c, date) + totalSales(c, date1);
    }

    /**
     @return total sales of strong drinks
     */
    public double totalSalesSnacks(){

        return totalSales(s, date) + totalSales(s, date1);
    }

    /**
     @return total sales
     */
    public double totalSales(Object s, Date date){

        if (s instanceof Snacks) {
            if (date.equals(date1))
                return 50;
            else return 60;
        } else if (s instanceof Food) {
            if (date.equals(date1))
                return 30;
            else return 60;
        } else if (s instanceof Concerts) {
            if (date.equals(date1))
                return 12000;
            else return 54000;
        }
        return 0;
    }

}
