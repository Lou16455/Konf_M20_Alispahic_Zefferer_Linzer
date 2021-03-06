package at.fhj.iit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Testing Concerts implementation")

/**
 * inits a Concert for EACH test
 */

public class TestConcert {

    /**
     *uses two names of concert
     *
     */
    private Concerts name, name2;

    /**
     *sets up the concerts
     */

    @BeforeEach
    void setup() {
        // SETUP PHASE
        name= new Concerts("Denzel", "rappy", "Hip Hop");
        name2 = new Concerts("Bob Marley", "soft", "sweet");
    }

    /**
     *sets up the testing contructor
     */
    @Test
    @DisplayName("Testing constructor")
    public void testConstructor() {
        assertEquals("Denzel", name.getName());
        assertEquals("Bob Marley", name2.getName());
    }

    /**
     *tests for getters and setters
     */
    @Test
    @DisplayName("Test name getter")
    public void testNameGetter(){
        assertEquals(name.getName(), "Denzel");
    }
    @Test
    @DisplayName("Test kind getter")
    public void testTextureGetter(){
        assertEquals(name2.getKind(), "soft");
    }
    @Test
    @DisplayName("Test band getter")
    public void testTasteGetter(){
        assertEquals(name2.getBand(), "sweet");
    }
    @Test
    @DisplayName("Test volume getter")
    public void testVolumeGetter(){
        assertEquals(0, name.getVolume());
    }
    @Test
    @DisplayName("Test AlcoholPercent getter")
    public void testAlcoholPercentGetter(){
        assertEquals(0, name2.getAlcoholPercent());
    }
    @Test
    @DisplayName("Test isAlcoholic")
    public void testisAlcoholic(){
        assertEquals(false, name.isAlcoholic());
    }
}
