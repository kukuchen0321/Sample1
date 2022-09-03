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

    public static void main(String[] args) {
        CreditCard boa = new MasterCard("Sana","10020004",200.0);
        boa.payBills(30.0);
        refund(20);
        System.out.println(boa.accountBalance);
    }
}
