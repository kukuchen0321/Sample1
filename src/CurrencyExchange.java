public class CurrencyExchange {
    public static Currency getCurrency(String type){
        if ("Yuan".equals(type)) {
            return new Yuan();
        }
        else if ("Dollar".equals(type)) {
            return new Dollar();
        }
        return null;
    }
}
