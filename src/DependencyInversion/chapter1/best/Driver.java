package DependencyInversion.chapter1.best;

public class Driver {
    private final Car car;

    public Driver(Car car) {
        //We did not use new keyword!
        this.car = car;
    }
    public void increaseSpeed(){
        this.car.accelerate();
    }
}
