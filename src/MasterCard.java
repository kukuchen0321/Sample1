public class MasterCard extends CreditCard{

    public MasterCard(String name, String num, double balance) {
        super();
        super.holdername = name;
        super.cardnumber = num;
        super.cardType = "Master";
        super.accountBalance = balance;
    }

    @Override
    boolean isCardAccepted(String cardType) {
        if (cardType.equals("Master")) {
            return true;
        }
        return false;
    }
}
