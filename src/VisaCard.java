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

    public static void main(String[] args) {
        CreditCard chase = new VisaCard("Momo","10020003",20.0);
        chase.payBills(80.0);
        refund(100);
        System.out.println(chase.accountBalance);
    }

}
