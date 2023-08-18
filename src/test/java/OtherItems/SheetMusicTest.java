package OtherItems;

import Shop.OtherItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Play guitar with the Beatles", 5.00, 8.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, sheetMusic.calculateMarkup(), 0.0001);
    }
}
