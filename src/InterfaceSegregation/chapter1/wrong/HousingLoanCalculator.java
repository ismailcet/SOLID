package InterfaceSegregation.chapter1.wrong;

public class HousingLoanCalculator implements CreditCalculator{
    @Override
    public float calculatePersonalCredit() {//Unnecessary
        return 0;
    }

    @Override
    public float calculateHousingLoan() {
        return 0;
    }

    @Override
    public float calculateCarLoan() {//Unnecessary
        return 0;
    }
}
