package Shop.instruments;

public class Guitar extends Instrument{
    private String stringType;
    private boolean electric;

    public Guitar(String brand, String colour, InstrumentType type, String material, double buyPrice, double sellPrice, String stringType, boolean electric) {
        super(brand, colour, type, material, buyPrice, sellPrice);
        this.stringType = stringType;
        this.electric = electric;
    }



    public String getStringType() {
        return stringType;
    }

    public boolean isElectric() {
        return electric;
    }

    public String play() {
        return "Twang twang!";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
