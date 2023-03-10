package ss19_string_regex.thuc_hanh.validate_email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputEmail {
    private Pattern pattern;
    private Matcher matcher;
    public static final String REGEX_EMAIL="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public InputEmail(){}
    public static boolean checkEmail(String str){
        Pattern p= Pattern.compile(REGEX_EMAIL);
        Matcher m= p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=input.nextLine();
        System.out.println(checkEmail(str));
    }
}
