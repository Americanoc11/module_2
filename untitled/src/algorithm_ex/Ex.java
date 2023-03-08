package algorithm_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex {
    static String space(String s){
        String[] array = s.split("");
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[i].toUpperCase())) {
                stringList.add(" ");
                stringList.add(array[i].toLowerCase());
            } else {
                stringList.add(array[i]);
            }
        }
        String result = "";
        for (String c : stringList) {
            result += c;
        }
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s =input.nextLine();
        space(s);
        System.out.println(space(s));

    }
}
