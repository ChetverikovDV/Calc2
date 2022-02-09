package calc;

import calc.operations.Operation;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Привет! plus должен складывать. minus вычитать. mult умножать, а div делить");
        Scanner scanner = new Scanner(System.in);
        InputParser parser = new InputParser();
        String exit = "";
        do {
            System.out.print("Введите первое число ");
            Integer a = parser.readInt(scanner);                 //первое
            System.out.print("Введите имя операции ");
            Operation operation = parser.readOperation(scanner);
            System.out.print("Введите второе число ");
            Integer b = parser.readInt(scanner);                 //второе
            System.out.println(operation.calculate(a, b));
            System.out.println("выйти? y/n");
            exit = scanner.nextLine();
        } while (!exit.equalsIgnoreCase("y"));
    }

}
