package DependencyInversion.chapter1.wrong;

public class Driver {
    private RacingCar racingCar;

    public Driver() {
        //This injection is depended lower class.
        this.racingCar = new RacingCar(100);
    }

    void increaseSpeed(){
        this.racingCar.accelerate();
    }
}
