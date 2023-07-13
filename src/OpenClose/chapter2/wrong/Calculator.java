package OpenClose.chapter2.wrong;

public class Calculator {
    public void calculate(CalculatorOperation operation){
        if(operation == null){
            throw new NullPointerException();
        }

        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getNum1() + addition.getNum2());
        }else if(operation instanceof  Subtraction){
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getNum2() - subtraction.getNum1());
        }
    }
}
