package instruments;

import Shop.instruments.Drumkit;
import Shop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DrumkitTest {

    Drumkit drumkit;

    @Before
    public void before() {
        drumkit = new Drumkit("Tama", "Green Sparkle", InstrumentType.Percussion, "Maple",100.00, 200.00, 4, false);
    }

    @Test
    public void canGetNumberOfDrums(){
        assertEquals(4, drumkit.getNumberOfDrums());
    }

    @Test
    public void canGetHardwareIncluded(){
        assertFalse(drumkit.includesHardware());
    }

    @Test
    public void canPlay(){
        assertEquals("Boom boom, crash!", drumkit.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100.00, drumkit.calculateMarkup(), 0.001);
    }

}
