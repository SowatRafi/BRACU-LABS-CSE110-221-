public class BankAccount{
    public String name=" ";
    public String address=" ";
    public String accountID=" ";
    public double balance=0.0;
      
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getAccountID(){
        return accountID;
    }
    public void setAccountID(String i){
        accountID=i;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address=a;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double c){
        balance=c;
    }
    public void addInterest(){
       double interest=(balance*7)/100;
        System.out.println("Interest: "+interest);
    }
}

        
