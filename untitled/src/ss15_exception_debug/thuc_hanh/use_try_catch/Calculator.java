package ss15_exception_debug.thuc_hanh.use_try_catch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag= true;
        do {
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);
        } while (flag);

    }
}
