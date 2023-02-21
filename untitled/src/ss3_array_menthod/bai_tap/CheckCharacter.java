package ss3_array_menthod.bai_tap;

import java.util.Scanner;

public class CheckCharacter {
    static int count(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character and check");
        char character = input.nextLine().charAt(0);
        String str = "aabcc";
        System.out.println(str);
        System.out.println("Character " + character + " display : " + count(str, character));
    }
}
