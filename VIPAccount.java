package Project;

public class VIPAccount extends BankAccount{

 private String lavel; //写private，保护数据

  public VIPAccount(int accountNumber, String accountName, double balance, boolean loanFlag, String lavel){
    super(accountNumber, accountName, balance,loanFlag);//super(bankaccount) constructor
    this.lavel = lavel;


  }

  @Override
  public double loan(double b) {
    double balance = super.getBalance();
    //只要调用，flag变为true*
    //return后总的balance
    balance +=b;
    super.setBalance(balance);
    return balance;


  }
  public double transfer(String country, double moneyCNY){

    if(country .equals("USD")){

      return moneyCNY / 6.6;

    }

    return 0;
  }

  public String transfer(String country){

    if(country .equals("USD")){

      return "USD to CNY is 1:6.8";

    }
    return "Transfer terminated";

  }





}
