package OpenClose.chapter1.best;

public class FrenchGreeting implements GreetingProvider{
    @Override
    public void greeting(String message) {
        System.out.println("\033[0;31m" + message);
    }
}
