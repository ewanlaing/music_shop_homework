package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Steel", true);
    }

    @Test
    public void canGetStringType(){
        assertEquals("Steel", guitar.getStringType());
    }

    @Test
    public void canCheckElectric(){
        assertTrue(guitar.isElectric());
    }
}
