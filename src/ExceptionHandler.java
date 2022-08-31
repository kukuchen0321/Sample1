public class ExceptionHandler {
    public static void handleException(String cardType,String address) {
        try {
            if (cardType == "AMEX") {
                throw new CardTypeException("AMEX is not accepted");
            }
        }
        catch (CardTypeException ex) {
            System.out.println(ex);
        }
        try {
            if (address != "United States") {
                throw new AddressException(address + " is out of United States");
            }
        }
        catch (AddressException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        handleException("AMEX","China");
    }
}
