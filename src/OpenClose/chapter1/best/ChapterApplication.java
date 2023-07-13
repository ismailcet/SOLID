package OpenClose.chapter1.best;

public class ChapterApplication {
    public static void main(String[] args) {
        GreetingProvider tr = new TurkishGreeting();
        tr.greeting("Turkey");

        GreetingProvider en = new EnglishGreeting();
        en.greeting("English");

        GreetingProvider fr = new FrenchGreeting();
        fr.greeting("French");
    }
}
