package OpenClose.chapter1.best;

public class EnglishGreeting implements GreetingProvider{
    @Override
    public void greeting(String message) {
        System.out.println("\033[0;35m" + message);
    }
}
