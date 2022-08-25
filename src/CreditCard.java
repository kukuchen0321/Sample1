public abstract class CreditCard {
    public String holdername;
    public String cardnumber;
    public double accountBalance;
    public String cardType;

    public CreditCard() {
    }
    abstract boolean isCardAccepted(String cardType);

    public void payBills(double bill) {
        accountBalance =- bill;
    }


    //static polymorphism: method overload.
    public void payBills(int bill) {
        accountBalance =- (double)bill;
    }
}
