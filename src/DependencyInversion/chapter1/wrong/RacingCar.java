package DependencyInversion.chapter1.wrong;

public class RacingCar {
    private int remainingFuel;
    private int power;

    public RacingCar(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    void accelerate(){
        power++ ;
        remainingFuel-- ;
    }
}
