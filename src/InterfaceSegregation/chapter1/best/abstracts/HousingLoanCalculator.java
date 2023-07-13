package InterfaceSegregation.chapter1.best.abstracts;

import InterfaceSegregation.chapter1.best.abstracts.common.CreditCalculator;

public interface HousingLoanCalculator extends CreditCalculator {
    float calculateHouseLoan();
}
