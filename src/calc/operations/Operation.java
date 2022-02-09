package calc.operations;

/**
 * А вот это у нас Интерфейс от которого наследуются операции
 */

import java.io.IOException;

public interface Operation {
    double calculate(double first, double second) throws IOException;
}
