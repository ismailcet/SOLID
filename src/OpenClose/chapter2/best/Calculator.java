package OpenClose.chapter2.best;

public class Calculator {
    public int calculate(CalculatorOperation operation){
        if(operation == null){
            throw new NullPointerException();
        }

        return operation.result();
    }
}
