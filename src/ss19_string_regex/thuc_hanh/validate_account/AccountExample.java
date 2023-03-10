package ss19_string_regex.thuc_hanh.validate_account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static final String REGEX_ACCOUNT = "^[a-z0-9]{6,}$";

    public static boolean checkAccount(String str) {
        Pattern p = Pattern.compile(REGEX_ACCOUNT);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= input.nextLine();
        System.out.println(checkAccount(str));
    }
}
