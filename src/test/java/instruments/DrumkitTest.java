package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DrumkitTest {

    Drumkit drumkit;

    @Before
    public void before() {
        drumkit = new Drumkit(4, false);
    }

    @Test
    public void canGetNumberOfDrums(){
        assertEquals(4, drumkit.getNumberOfDrums());
    }

    @Test
    public void canGetHardwareIncluded(){
        assertFalse(drumkit.includesHardware());
    }

}
