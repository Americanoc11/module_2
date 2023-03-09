package ss15_exception_debug.thuc_hanh.use_try_catch.Fractor;

public class Fraction extends Exception{
    private int numberator;
    private int denominator;
    public Fraction(){}


    public int getNumberator() {
        return numberator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int n, int d) throws Exception{
        numberator=n;
        denominator=d;
    }
}
