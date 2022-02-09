package calc.operations;
/**
 * А это, мать его ПЛЮС
 */
public class Sum implements Operation{

    @Override
    public double calculate(double first, double second) {
        return first + second;
    }
}
