package cp.lab5.inputText;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputText {
    public int chooseVariantOfInputting() {
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            System.out.println("Choose a way of inputting your text: 1 by file, 2 by console");
            try {
                choose = Integer.parseUnsignedInt(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Введе значення не є невід'ємним числом");
            }
        } while (choose != 1 && choose != 2);

        return choose;
    }

    public String inputText() {
        int choose = chooseVariantOfInputting();
        String text;

        if (choose == 1) {  //By file
            text = byFile();
        } else {            //By console
            text = byConsole();
        }

        checkIsEmpty(text);

        return text;
    }

    public String byFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader("Text.txt")) {
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                stringBuilder.append(scan.nextLine()).append(" ");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return stringBuilder.toString().strip();
    }
    public String byConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void checkIsEmpty(String s) {
        if(s == null || s.length() == 0) {
            s = "";
            System.err.println("Стрічка порожня");
        }
    }
}
