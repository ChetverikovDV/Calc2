package calc.operations;

/**
 * А это минус
 */
public class Minus implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first - second;
    }
}

