package calc.operations;

public class Mult implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first*second;
    }
}

