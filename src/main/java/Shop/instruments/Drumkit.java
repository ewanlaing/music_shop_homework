package Shop.instruments;

public class Drumkit extends Instrument{
    private int numberOfDrums;
    private boolean includesHardware;

    public Drumkit(String brand, String colour, InstrumentType type, String material, double buyPrice, double sellPrice, int numberOfDrums, boolean includesHardware) {
        super(brand, colour, type, material, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
        this.includesHardware = includesHardware;
    }


    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public boolean includesHardware() {
        return includesHardware;
    }

    public String play() {
        return "Boom boom, crash!";
    }


    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
