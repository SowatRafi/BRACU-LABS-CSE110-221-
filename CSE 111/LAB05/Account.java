public class Account{
  static double interestRate = 5.0;
  String name = "Default Account";
  double balance = 0.0;
  Account(){
  }
  Account(String n){
    name = n;
  }
  Account(double d){
    balance = d;
  }
  Account(String n, double d){
    name = n;
    balance = d;
  }
  public void nameBoshao(String n){
    name = n;
  }
  public String nameKi(){
    return name;
  }
  public void balanceBoshao(double b){
    balance = b;
  }
  public double balanceKi(){
    return balance;
  }
  public void withdraw(double w){
    if (balance-w <= 100){
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    }
    else {
      balance = balance-w;
      System.out.println("Withdraw successful! New balance is: " + balance);
    }
    
  }
}