public abstract class CreditCard {
    String holdername;
    String cardnumber;
    static double accountBalance;
    String cardType;

    public CreditCard() {
    }
    abstract boolean isCardAccepted(String cardType);

    public void payBills(double bill) {
        this.accountBalance = this.accountBalance - bill;
    }


    //static polymorphism: method overload.
    public void payBills(int bill) {
        accountBalance =- (double)bill;
    }

    public static void refund(double bill) {
        accountBalance = accountBalance+ bill;
    }
}
