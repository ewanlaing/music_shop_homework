package instruments;

import Shop.instruments.Guitar;
import Shop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Red", InstrumentType.String, "wood", 80, 160, "steel", true);
    }

    @Test
    public void canGetStringType(){
        assertEquals("steel", guitar.getStringType());
    }

    @Test
    public void canCheckElectric(){
        assertTrue(guitar.isElectric());
    }

    @Test
    public void canPlay(){
        assertEquals("Twang twang!", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(80.00, guitar.calculateMarkup(), 0.001);
    }
}
