package calc;

/**
 * Класс со списком арифметических операций
 * @author Ulfr
 * @version 1.1
 */

import calc.operations.*;
import java.io.IOException;
import java.util.Locale;

public class OperationChooser {
    public Operation chooseOp(String operand) throws IOException {
        switch (operand.toLowerCase(Locale.ROOT)) {
            case "plus":
                return new Sum();
            case "minus":
                return new Minus();
            case "mult":
                return new Mult();
            case "div":
                return new Div();
            default:
                throw new IOException("плохая идея ");
        }
    }
}
