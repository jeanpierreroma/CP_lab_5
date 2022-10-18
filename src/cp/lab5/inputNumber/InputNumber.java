package cp.lab5.inputNumber;

import java.util.Random;
import java.util.Scanner;

public class InputNumber {
    public int chooseVariantOfInputting() {
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            System.out.println("Choose a way of inputting your size: 1 by random, 2 by console");
            try {
                choose = Integer.parseUnsignedInt(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Введе значення не є невід'ємним числом");
            }
        } while (choose != 1 && choose != 2);

        return choose;
    }

    public int inputNumber() {
        int choose = chooseVariantOfInputting();
        int size;

        if (choose == 1) {  //By random
            size = byRandom();
        } else {            //By console
            size = byConsole();
        }

        return size;
    }

    public int inputNumber(int choose) {
        int size;

        if (choose == 1) {  //By random
            size = byRandom();
        } else {            //By console
            size = byConsole();
        }

        return size;
    }

    public int byRandom() {
        int r = new Random().nextInt(0, 100);
        System.out.println("Your number is " + r);
        return r;
    }
    public int byConsole() {
        Scanner scanner = new Scanner(System.in);
        int size = -1;
        do {
            try {
                size = Integer.parseUnsignedInt(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Введе значення не є невід'ємним числом");
            }
        } while (size == -1 || size > 100);

        return size;
    }
}