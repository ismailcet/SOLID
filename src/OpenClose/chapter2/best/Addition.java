package OpenClose.chapter2.best;

public class Addition implements CalculatorOperation{
    private int num1;
    private int num2;

    public Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int result() {
        return num1 + num2;
    }
}
