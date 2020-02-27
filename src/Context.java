public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String convertTo(int cislo) {
        return strategy.convert(cislo);
    }
}
