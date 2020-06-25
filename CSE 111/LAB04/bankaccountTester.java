public class bankaccountTester{
  public static void main(String args[]){
    bankaccount acc1 = new bankaccount();
    acc1.setName("X");
    acc1.setAddress("Banani");
    acc1.setAccountID("123");
    acc1.setBalance(12345.97);
    bankaccount acc2 = new bankaccount();
    acc2.setName("Y");
    acc2.setAddress("Gulshan");
    acc2.setAccountID("456");
    acc2.setBalance(4567.7328);
    bankaccount acc3 = new bankaccount();
    acc3.setName("Z");
    acc3.setAddress("Motijheel");
    acc3.setAccountID("789");
    acc3.setBalance(27653);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println(acc1.getName());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getBalance());
    System.out.println(acc1.addInterest());
    System.out.println("-------------");
    System.out.println(acc2.getName());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getBalance());
    System.out.println("-------------");
    System.out.println(acc3.getName());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getBalance());
    System.out.println(acc3.addInterest());
  }
}