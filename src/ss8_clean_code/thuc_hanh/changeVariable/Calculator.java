package ss8_clean_code.thuc_hanh.changeVariable;

public class Calculator {
    private int firstOperand;
    private int secondOperand;

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    private char operator;
    public static final char addition = '+';
    public static final char subitraction = '-';
    public static final char multiplication = '*';
    public static final char division = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case addition:
                return firstOperand + secondOperand;
            case subitraction:
                return firstOperand - secondOperand;
            case multiplication:
                return firstOperand * secondOperand;
            case division:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public Calculator() {

    }

    public Calculator(int firstOperand, int secondOperand, char operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    int getCalculator() {
        return calculate(getFirstOperand(), getSecondOperand(), getOperator());
    }

}
