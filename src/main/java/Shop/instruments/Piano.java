package Shop.instruments;

public class Piano extends Instrument{
    private boolean grand;

    public Piano(String brand, String colour, InstrumentType type, String material, double buyPrice, double sellPrice, boolean grand) {
        super(brand, colour, type, material, buyPrice, sellPrice);
        this.grand = grand;
    }


    public boolean isGrand() {
        return grand;
    }

    public String play() {
        return "plinky plonky";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
