public class VisaCard extends CreditCard{

    public VisaCard(String name, String num, double balance) {
        super();
        super.holdername = name;
        super.cardnumber = num;
        super.cardType = "Visa";
        super.accountBalance = balance;
    }

    //dynamic polymorphism
    @Override
    boolean isCardAccepted(String cardType) {
        if (cardType.equals("Visa")) {
            return true;
        }
        return false;
    }

}
