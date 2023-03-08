package ss15_exception_debug.thuc_hanh.use_try_catch;

public class CalculationExample {
    boolean calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Xin mời nhập lại");
            return true;
        }
        return false;
    }
}
