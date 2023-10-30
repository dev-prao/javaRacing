package racingcar.enums;

public enum Symbols {
    GAME_SCORE("-"),
    쉼표(",");

    private final String symbol;

    Symbols(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
