package enums;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 16:01
 */

public enum Localization {

    WROCLAW("Wrocław"),
    WARSZAWA("Warszawa");

    private final String value;

    private Localization(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
