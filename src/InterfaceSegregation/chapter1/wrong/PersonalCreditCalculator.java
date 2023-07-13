package InterfaceSegregation.chapter1.wrong;

public class PersonalCreditCalculator implements CreditCalculator{
    @Override
    public float calculatePersonalCredit() {
        return 0;
    }

    @Override
    public float calculateHousingLoan() { //Unnecessary
        return 0;
    }

    @Override
    public float calculateCarLoan() {//Unnecessary
        return 0;
    }
}
