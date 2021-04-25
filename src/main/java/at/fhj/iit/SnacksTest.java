

package at.fhj.iit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Snacks implementation")
public class SnacksTest {
    private Snacks chips, chocolate;
    /**
     * inits a snack for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        chips = new Snacks("Chips", "crispy", "salty");
        chocolate = new Snacks("Chocolate", "soft", "sweet");
    }
    @Test
    @DisplayName("Testing constructor")
    public void testConstructor() {
        assertEquals("Chips", chips.getName());
        assertEquals("Chocolate", chocolate.getName());
    }
    @Test
    @DisplayName("Test name getter")
    public void testNameGetter(){
        assertEquals(chips.getName(), "Chips");
    }
    @Test
    @DisplayName("Test texture getter")
    public void testTextureGetter(){
        assertEquals(chocolate.getTexture(), "soft");
    }
    @Test
    @DisplayName("Test taste getter")
    public void testTasteGetter(){
        assertEquals(chocolate.getTaste(), "sweet");
    }
    @Test
    @DisplayName("Test volume getter")
    public void testVolumeGetter(){
        assertEquals(0, chips.getVolume());
    }
    @Test
    @DisplayName("Test AlcoholPercent getter")
    public void testAlcoholPercentGetter(){
        assertEquals(0, chips.getAlcoholPercent());
    }
    @Test
    @DisplayName("Test isAlcoholic")
    public void testisAlcoholic(){
        assertEquals(false, chips.isAlcoholic());
    }

}