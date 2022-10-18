package cp.lab5.workSpace;

import cp.lab5.inputNumber.InputNumber;
import cp.lab5.inputText.InputText;
import cp.lab5.printManage.PrintManage;

import java.util.*;
import java.util.regex.Pattern;

public class WorkPlace {
    private final String text;
    private int wordSize;

    public String getText() {
        return text;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void changeWordSize(int newSize) {
        wordSize = newSize;
    }

    public WorkPlace(String text, int wordSize) {
        this.text = text;
        this.wordSize = wordSize;
    }

    public static void execute() {
        WorkPlace workPlace = new WorkPlace(new InputText().inputText(), new InputNumber().inputNumber());

        boolean isProcess = true;
        do {
            System.out.println(
                    """
                            1.Вивід тексту
                            2.Вивід списку усіх речень
                            3.Вивід списку усіх питальних речень
                            4.Вивід значення заданої довжини
                            5.Змінити значення заданої довжини
                            6.Вивід усіх слів (в питальних реченнях), довжина яких дорівнює заданій
                            7.Завершити роботу програми"""
            );

            Scanner scanner = new Scanner(System.in);
            int chose = Integer.parseInt(scanner.next());
            switch (chose) {
                case 1 -> {
                    System.out.println("Вивід тексту");
                    PrintManage.PrintText(workPlace.getText());
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println("Вивід списку усіх речень");
                    PrintManage.PrintList(workPlace.devideText());
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println("Вивід списку усіх питальних речень");
                    PrintManage.PrintList(workPlace.onlyQuestions());
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println("Вивід значення заданої довжини");
                    System.out.println("Задане значення " + workPlace.getWordSize());
                    System.out.println("\n");
                }
                case 5 -> {
                    System.out.println("Змінити значення заданої довжини");
                    workPlace.changeWordSize(new InputNumber().inputNumber(2));
                    System.out.println("\n");
                }
                case 6 -> {
                    System.out.println("Вивід усіх слів (в питальних реченнях), довжина яких дорівнює заданій");
                    PrintManage.PrintSet(workPlace.wordsOfGivenLenth());
                    System.out.println("\n");
                }
                case 7 -> {
                    System.out.println("Роботу програми завершено!");
                    isProcess = false;
                }
                default -> System.out.println("Введено неправильну цифру");
            }
        } while (isProcess);
    }

    public List<String> devideText() {
        String text = getText();
//        ?<= - означає позитивний прохід назад
//        \w - Буквений або цифровий символ, або знак подкреслювання; букви лише латинські
//        [] - будь-який симол з задоного переліку
//        Я ділю текст по пробілу, але дивлюсь чи перед цим пробілом є знак (крапка, знак питання або знак оклику)

        return new ArrayList<>(Arrays.asList(text.split("(?<=\\w[.!?]) ")));
    }

    public List<String> onlyQuestions() {
        List<String> strings = devideText();

        ArrayList<String> questions = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > 0 && string.charAt(string.length() - 1) == '?') {
                questions.add(string);
            }
        }
        return questions;
    }

    public Set<String> wordsOfGivenLenth() {
        List<String> questions = onlyQuestions();
        int givenSize = getWordSize();

        HashSet<String> words = new HashSet<>();
        for (String question : questions) {
            ArrayList<String> wordsOfSentence = new ArrayList<>(Arrays.asList(question.split("[ ?]")));
            for (String s : wordsOfSentence) {
                if (Pattern.matches("(\\w{" + givenSize + "})", s)) {
                    words.add(s);
                }
            }
        }
        return words;
    }
}
