package at.fhj.iit;

import java.util.Date;
/**
 cash register class for the protocol  of the prices, date and cashier
 */

public abstract class Registrierkasse implements NonAlcoholic , StrongDrink, WeakDrink {

    /**
     * two dates, because our two-day-event
     */
    private Date date;
    private Date date1;
    /**
     @param date and name of the person
     @return total sales of a person
     */
    public double personSales(String name, Date date){

        switch (name){
            case "Chiara":
                return totalSales("strong", date);

            case "Lukas":

                return totalSales("weak", date);

            case "Sadzida":
                return totalSales("nonAlc", date);
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
                return totalSales("strong", date) + totalSales("strong", date1);

            case "Lukas":
                return totalSales("weak", date) + totalSales("weak", date1);

            case "Sadzida":
                return totalSales("nonAlc", date) + totalSales("nonAlc", date);
        }
        return 0;
    }

    /**
     @param date
     @return total sales of a date
     */
    public double salesDate(Date date){
        return totalSales("nonAlc", date) + totalSales("weak", date)+ totalSales("strong", date);
    }

    /**
     @return total sales of non alcoholic drinks
     */
    public double totalSalesNonAlc(){
         return totalSales("nonAlc", date) + totalSales("nonAlc", date1);
    }

    /**
     @return total sales of weak drinks
     */
    public double totalSalesWeak(){
        return totalSales("weak", date) + totalSales("weak", date1);
    }

    /**
     @return total sales of strong drinks
     */
    public double totalSalesStrong(){
        return totalSales("strong", date) + totalSales("strong", date1);
    }

    /**
     @return total sales
     */
    public double totalSales(String s, Date date){

        switch (s){
            case "weak":
                if(date == date)
                return 50;
                else  return 60;

            case "strong":
                if(date == date)
                    return 30;
                else  return 40;

            case "nonAlc":
                if(date == date)
                    return 60;
                else  return 80;
        }
        return 0;
    }

    /**
     @return the price of the non alcoholic drink
     */

    @Override
    public double priceNonAlc() {
        return 5;
    }

    /**
     @return the current date
     */
    @Override
    public Date date() {
        Date date = new Date(System.currentTimeMillis());
        return date;
    }

    /**
    @return the price of the weak drink
     */

    @Override
    public double priceStrong() {
        return 15;
    }
    /**
    @return the price of the weak drink
     */
    @Override
    public double priceWeak() {
        return 10;
    }

    /**
    @param s of the person
    @return string name of the person
 */
    @Override
    public String person(String s) {
        return s;
    }
}
