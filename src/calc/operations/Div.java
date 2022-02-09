package calc.operations;

import java.io.IOException;

public class Div implements Operation {
    private double second;

    @Override
    public double calculate(double first, double second) throws IOException {
        checkValue(second);
        return first / second;
    }

    private void checkValue(double second) throws IOException {
        if (!isValueCorrect(second)){
            System.out.println("Плохая идея");
            return;
        }
    }

    private boolean isZero(double second){
        return second ==0;
    }

    private boolean isValueCorrect(double second){
        return !isZero(second);
    }

}

