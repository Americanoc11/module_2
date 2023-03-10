package ss19_string_regex.bai_tap.validate_name_class;

import ss9_dsa_list.bai_tap.excercise.view.Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String REGEX_CLASS_NAME= "^[A-Z][0-9]{4,4}*(G|H|I|K)$";
    public static boolean checkNameClass(String str){
        Pattern p= Pattern.compile(REGEX_CLASS_NAME);
        Matcher m= p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter name class");
        String classes=input.nextLine();
        System.out.println(checkNameClass(classes));
    }
}
