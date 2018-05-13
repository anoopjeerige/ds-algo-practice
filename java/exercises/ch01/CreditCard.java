/**
* A simple model for a consumer credit card
*
*@author Anoop
*/
public class CreditCard {
  // Instance variables;
  private String customer;
  private String bank;
  private String account;
  private int limit;
  protected double balance;

  // Constructors
  public CreditCard(String customer, String bank, String account, int limit, double balance) {
    this.customer = customer;
    this.bank = bank;
    this.account = account;
    this.limit = limit;
    this.balance = balance;
  }

  public CreditCard(String customer, String bank, String account, int limit) {
    this(customer, bank, account, limit, 0.0);
  }

  // Accessor methods
  public String getCustomer() { return this.customer; }
  public String getBank() { return this.bank; }
  public String getAccount() { return this.account; }
  public int getLimit() { return this.limit; }
  public double getBalance() { return this.balance; }

  // Update methods
  /** r-1.11 method to update credit limit */
  public void setLimit(int limit) {
    this.limit = limit;
  }

  public boolean charge(double price) {
    if (getBalance() + price > getLimit()) {
      return false;
    }
    this.balance += price;
    return true;
  }

  public void makePayment(double amount) {
    // check if amount is non-negative
    if (amount > 0) {
      this.balance -= amount;
    }
  }

  public static void printSummary(CreditCard card) {
    System.out.println("Customer " + card.getCustomer());
    System.out.println("Bank " + card.getBank());
    System.out.println("Account " + card.getAccount());
    System.out.println("Balance " + card.getBalance());
    System.out.println("Limit " + card.getLimit());
  }

  // main method to test
  public static void main(String[] args) {
    CreditCard[] wallet = new CreditCard[2];
    wallet[0] = new CreditCard("John Wick", "US Bank", "1234 4567 7890 0987", 5000);
    wallet[1] = new CreditCard("Tony Stark", "Chase Bank", "1234 1234 1235 1231", 100000, 300);

    // charge the cards
    for(int i = 1; i <= 10; i++) {
      wallet[0].charge(i*2);
      wallet[1].charge(i^2);
    }

    // print balances
    for(int i = 0; i < wallet.length; i++) {
      printSummary(wallet[i]);
      wallet[i].makePayment(100);
      System.out.println("New balance " + wallet[i].getBalance());
    }
    wallet[0].setLimit(10000);
    printSummary(wallet[0]);

    wallet[0].makePayment(-4);
    printSummary(wallet[0]);


  }
}
