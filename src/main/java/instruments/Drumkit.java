package instruments;

public class Drumkit {
    private int numberOfDrums;
    private boolean includesHardware;

    public Drumkit(int numberOfDrums, boolean includesHardware) {
        this.numberOfDrums = numberOfDrums;
        this.includesHardware = includesHardware;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public boolean includesHardware() {
        return includesHardware;
    }
}
