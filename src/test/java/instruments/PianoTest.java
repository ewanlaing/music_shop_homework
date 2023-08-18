package instruments;

import Shop.instruments.InstrumentType;
import Shop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", "Black", InstrumentType.Keyboard, "wood",1000, 2000, false);
    }

    @Test
    public void checkIfPianoIsGrand(){
        assertFalse(piano.isGrand());
    }

    @Test
    public void canPlay(){
        assertEquals("plinky plonky", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1000.00, piano.calculateMarkup(), 0.001);
    }
}
