package ss3_array_menthod.bai_tap;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        String[] students = {"Danh", "Duc", "Tuan", "Tri"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String inputName = input.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Tên nằm trong danh sách: " + inputName + " vị trí " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (isExit == false) {
            System.out.println(" không tìm thấy " + inputName + " trong danh sách");
        }
    }
}
