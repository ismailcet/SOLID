package OpenClose.chapter1.wrong;

public class GreetingProvider {
    public void greeting(String greetingMessage, CountryCode countryCode){
        if(countryCode == CountryCode.TR){
            System.out.println("\033[0;31m" + greetingMessage);
        }else if(countryCode == CountryCode.EN){
            System.out.println("\033[0;35m" + greetingMessage);
        }else if(countryCode == CountryCode.FR){
            System.out.println("\033[0;31m" + greetingMessage);
        }
    }
}
