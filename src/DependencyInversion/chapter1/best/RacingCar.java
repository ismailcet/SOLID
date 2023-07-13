package DependencyInversion.chapter1.best;

public class RacingCar implements Car{
    private int remainingFuel;
    private int power;

    public RacingCar(int power) {
        this.power = power;
    }

    @Override
    public void accelerate() {
        remainingFuel--;
        power++;
    }
}
