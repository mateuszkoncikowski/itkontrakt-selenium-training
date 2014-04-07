package enums;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 15:57
 */

public enum Position {

    TESTER("Tester"),
    DEVELOPER("Programista");

    private final String value;

    private Position(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
