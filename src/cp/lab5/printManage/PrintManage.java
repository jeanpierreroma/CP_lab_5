package cp.lab5.printManage;

import java.util.List;
import java.util.Set;

public class PrintManage {
    public static void PrintText(String text) {
        System.out.println(text);
    }
    public static void PrintList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static void PrintSet(Set<String> words) {
        words.forEach(System.out::println);
    }
}
