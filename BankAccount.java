package Project;

public class BankAccount {
  private int accountNumber;
  private String costumerName;
  private double balance;
  private boolean loanFlag;
  private double b;


// balance
  public BankAccount(int accountNumber, String costumerName, double balance, boolean loanFlag){
   this.accountNumber = accountNumber;
    this.balance = balance;
    this.costumerName = costumerName;
    this.loanFlag = loanFlag;




    }

    //是否借钱，借为true
    //赋值在constructor里面做





  public double deposit(double s){
  //after addition
    return balance += s;
  }

  public double withdraw(double e) {

    // e < balance*
    //After
    if (e > balance) {
      System.out.println("The balance is not sufficient to make this transaction");


    }
    if (e < balance) {
      return balance += -e;
    }
return 0;
  }
  public double loan(double b) {
    this.b = b;

    //只要调用，flag变为true*
    //return后总的balance
    return balance += b;
  }

  public boolean LoanFlag() {

    if (b > 0) {
      return !loanFlag;
    } else {
      return loanFlag;
    }

  }

  public static void main(String[] args) {


BankAccount a = new BankAccount(45, "andy", 50, false);
a.deposit(10);
a.withdraw(63);
a.loan(1);
a.LoanFlag();

    System.out.println("The account number:" + a.accountNumber + " which is belong to " + a.costumerName + " now has the balance " + a.balance + ".");
    System.out.print("The loan status is " + a.loanFlag);






  }










}


