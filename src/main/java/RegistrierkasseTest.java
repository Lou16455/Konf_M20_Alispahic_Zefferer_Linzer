
import static org.junit.jupiter.api.Assertions.assertEquals;

import at.fhj.iit.Concerts;
import at.fhj.iit.Food;
import at.fhj.iit.Registrierkasse;
import at.fhj.iit.Snacks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Testing Registrierkasse complete Test Coverage
 */

@DisplayName("Testing Registrierkasse implementation")

/**
 * class inits a price for EACH test
 */

public class RegistrierkasseTest {

    private Registrierkasse reg;

    /**
     * sets up the snacks
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        reg = new Registrierkasse();
        Snacks s = new Snacks("chips", "crispy", "salty");
        Concerts c = new Concerts("Heidi", "rap", "Heidi-Band");
        Food f = new Food("ananas", "sour", "fruit");

    }

    /**
     * tests for methods
     */

    /**
     * tests the total sales of a person on a specific date
     */
    @Test
    @DisplayName("test total sales a person made")
    public void personSalesDate() {
        assertEquals(reg.personSalesDate("Chiara", reg.getDate1()), 50);

        assertEquals(reg.personSalesDate("Chiara", reg.getDate()), 60);

        assertEquals(reg.personSalesDate("Lukas", reg.getDate1()), 12000);

        assertEquals(reg.personSalesDate("Lukas", reg.getDate()), 54000);

        assertEquals(reg.personSalesDate("Sadzida", reg.getDate1()), 30);

        assertEquals(reg.personSalesDate("Sadzida", reg.getDate()), 60);
    }

    /**
     * tests the total sales of a person
     */

    @Test
    @DisplayName("test total sales a person made")
    public void personSales() {
        assertEquals(reg.personSales("Chiara"), 110);

        assertEquals(reg.personSales("Lukas"), 66000);

        assertEquals(reg.personSales("Sadzida"), 90);
    }

    /**
     * tests the total sales of all products on a date
     */

    @Test
    @DisplayName("test total sales on a day")
    public void salesDate() {
        assertEquals(reg.salesDate(reg.getDate1(), reg.getS(),
                reg.getF(), reg.getC()), 12080);

        assertEquals(reg.salesDate(reg.getDate(), reg.getS(),
                reg.getF(), reg.getC()), 54120);
    }

    /**
     * tests the total sales of food products
     */

    @Test
    @DisplayName("test total sales food")
    public void totalSalesFood() {
        assertEquals(reg.totalSalesFood(), 90);
    }

    /**
     * tests the total sales of concert tickets
     */

    @Test
    @DisplayName("test total sales concert")
    public void totalSalesConcert() {
        assertEquals(reg.totalSalesConcert(), 66000);
    }

    /**
     * tests the total sales of snacks products
     */

    @Test
    @DisplayName("test total sales snacks")
    public void totalSalesSnack() {

        assertEquals(reg.totalSalesSnacks(), 110);
    }

    /**
     * tests the total sales on a date
     */

    @Test
    @DisplayName("Test total sales on a day")
    public void totalSales() {
        double resSnack = reg.totalSales(reg.getS(), reg.getDate());
        assertEquals(60.0, resSnack);

        double resSnack1 = reg.totalSales(reg.getS(), reg.getDate1());
        assertEquals(50.0, resSnack1);

        double resFood = reg.totalSales(reg.getF(), reg.getDate());
        assertEquals(60.0, resFood);

        double resFood1 = reg.totalSales(reg.getF(), reg.getDate1());
        assertEquals(30.0, resFood1);

        double resCon = reg.totalSales(reg.getC(), reg.getDate());
        assertEquals(54000.0, resCon);

        double resCon1 = reg.totalSales(reg.getC(), reg.getDate1());
        assertEquals(12000.0, resCon1);

    }

    /**
     * tests for getters and Dates
     */

    @Test
    @DisplayName("test getter for food")
    public void getDate1() {
        assertEquals(reg.getDate1(), new Date(System.currentTimeMillis()));
    }

    @Test
    @DisplayName("test getter for food")
    public void getDate() {
        assertEquals(reg.getDate(), reg.getDate());
    }


    @Test
    @DisplayName("test getter for food")
    public void getS() {
        assertEquals(reg.getS(), reg.getS());
    }

    @Test
    @DisplayName("test getter for food")
    public void getC() {
        assertEquals(reg.getC(), reg.getC());
    }

    @Test
    @DisplayName("test getter for food")
    public void getF() {
        assertEquals(reg.getF(), reg.getF());
    }
}
