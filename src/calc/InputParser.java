package calc;

import calc.operations.Operation;

import java.io.IOException;
import java.util.Scanner;

/**
 * это класс для разбора той хрени которую вве пользователь и превращения ее в нужные нам
 * объекты
 */
public class InputParser {

    /**
     * читает введенную строку и пытается превратить ее в число.
     * Если превратить не удается, предлагает ввести зангово (рекурсия)
     *
     * @param scanner объект класса {@link Scanner}
     * @return
     */
    public Integer readInt(Scanner scanner){
        try {
            return Integer.parseInt(scanner.nextLine());
        }   catch (NumberFormatException e){
            System.out.println("попробуй исче ");
            return readInt(scanner);
        }

    }

    public Operation readOperation(Scanner scanner){
        try {
            OperationChooser chooser = new OperationChooser();
            return chooser.chooseOp(scanner.nextLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("попробуй исче ");
            return readOperation(scanner);
        }
    }

}
