package InterfaceSegregation.chapter1.wrong;

public class CarLoanCalculator implements CreditCalculator{
    @Override
    public float calculatePersonalCredit() {//Unnecessary
        return 0;
    }

    @Override
    public float calculateHousingLoan() {//Unnecessary
        return 0;
    }

    @Override
    public float calculateCarLoan() {
        return 0;
    }
}
