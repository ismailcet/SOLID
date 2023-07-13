package InterfaceSegregation.chapter1.best.abstracts;

import InterfaceSegregation.chapter1.best.abstracts.common.CreditCalculator;

public interface CarLoanCalculator extends CreditCalculator{
    float calculatorCarLoan();
}
