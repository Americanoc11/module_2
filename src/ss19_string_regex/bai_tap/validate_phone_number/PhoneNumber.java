package ss19_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String REGEX_PHONE_NUMBER="^[(][0-9]{2}[)][-][(][0-9]{10}[)]$";
    public static boolean checkPhoneNumber(String str){
        Pattern p= Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher m= p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a phone number");
        String phoneNumber=input.nextLine();
        System.out.println(checkPhoneNumber(phoneNumber));
    }
}
