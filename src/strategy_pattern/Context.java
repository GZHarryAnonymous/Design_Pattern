package strategy_pattern;

public class Context {
    Strategy strategy;

    public Context() {
        this.strategy = null;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterfece() {
        strategy.AlgorithmInterface();// dynamic binding.
    }

    // combine the simple factory pattern.
    public void setStrategy(String type) {
        switch (type) {
        case "A":
            strategy = new ConcreteStrategyA();
            break;
        case "B":
            strategy = new ConcreteStrategyB();
            break;
        default:
            break;
        }
    }

}
