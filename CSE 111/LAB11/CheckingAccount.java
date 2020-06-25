public class CheckingAccount extends Account{
  CheckingAccount(String n, double b){
    super(n);
    setBalance(b);
  }
  public void printAccountInfo(){
    if(getBalance()>500){
      System.out.println( "======================================="+"\n"+"Name : "+getName()+"\n"+"Account Number : "+getAccountNumber()+"\n"+"Balance : "+getBalance()+"\n"+"=======================================");
    }
    else{
      System.out.println ("======================================="+"\n"+"Name : "+getName()+"\n"+"Account Number : "+getAccountNumber()+"\n"+"Balance : "+getBalance()+"\n"+"Your balance is less than the minimum amount"+"\n"+"=======================================");
    }
  }
  public String deposit(double d){
    if(d>0){
       double w= getBalance()+d;
     setBalance(w);
      return "Deposit successfull";
    }
    else{
    
      return "Please enter amount greater than Zero";
    }
  }
  public String withdraw(double n){
    if(getBalance()>n){
      double g = getBalance()-n;
      setBalance(g);
      return "withdraw successfull";
    }
    else{
      return "You do not have enough funds";
    }
  }
}
