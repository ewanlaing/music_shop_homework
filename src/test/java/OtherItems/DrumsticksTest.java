package OtherItems;

import Shop.OtherItems.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("5a", 10.00, 15.00);
    }

    @Test
    public void canCheckMarkup(){
        assertEquals(5.00, drumsticks.calculateMarkup(), 0.001);
    }
}
