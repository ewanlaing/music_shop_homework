package instruments;

public class Guitar {
    private String stringType;
    private boolean electric;

    public Guitar(String stringType, boolean electric) {
        this.stringType = stringType;
        this.electric = electric;
    }

    public String getStringType() {
        return stringType;
    }

    public boolean isElectric() {
        return electric;
    }
}
