package at.fhj.iit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    @DisplayName("Testing Food implementation")
    public class FoodTest {
        private Food ananas, blueberry;
        /**
         * inits a food for EACH test
         */
        @BeforeEach
        void setup() {
            // SETUP PHASE
            ananas = new Food("Ananas", "sweet-sour", "fruit");
            blueberry = new Food("Blueberry", "sweet", "fruit");
        }
        @Test
        @DisplayName("Testing constructor")
        public void testConstructor() {
            assertEquals("Ananas", ananas.getName());
            assertEquals("Blueberry", blueberry.getName());
        }
        @Test
        @DisplayName("Test name getter")
        public void testNameGetter(){
            assertEquals(ananas.getName(), "Ananas");
        }
        @Test
        @DisplayName("Test flavour getter")
        public void testFlavourGetter(){
            assertEquals((blueberry.getFlavour()), "sweet");
        }
        @Test
        @DisplayName("Test kind getter")
        public void testKindGetter(){
            assertEquals(ananas.getKind(), "fruit");
        }
        @Test
        @DisplayName("Test volume getter")
        public void testVolumeGetter(){
            assertEquals(0, ananas.getVolume());
        }
        @Test
        @DisplayName("Test AlcoholPercent getter")
        public void testAlcoholPercentGetter(){
            assertEquals(0, blueberry.getAlcoholPercent());
        }
        @Test
        @DisplayName("Test isAlcoholic")
        public void testisAlcoholic(){
            assertEquals(false, blueberry.isAlcoholic());
        }
    }

