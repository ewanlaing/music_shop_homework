import Shop.OtherItems.Drumsticks;
import Shop.Shop;
import Shop.instruments.Drumkit;
import Shop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Drumkit drumkit;
    Drumsticks drumsticks;

    @Before
    public void before() {
        drumkit = new Drumkit("Tama", "Green sparkle", InstrumentType.Percussion, "Maple", 500.00, 1000.00, 4, false);
        drumsticks = new Drumsticks("5a", 10.00, 15.00);
        shop = new Shop();
    }


    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }
    @Test
    public void canAddToStock(){
        shop.addToStock(drumkit);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(drumkit);
        shop.removeFromStock(drumkit);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(drumkit);
        shop.addToStock(drumsticks);
        assertEquals(505.00, shop.calculateTotalPotentialProfit(), 0.001);
    }




}
