import java.util.Scanner;
public class Part02Task07{
    public static void main(String []args){
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
        BankAccount acc3=new BankAccount();
        
        acc1.setName("Nishat Anjum");
        System.out.println("Name: "+acc1.getName());
        acc1.setAccountID("211198");
        System.out.println("ID: "+acc1.getAccountID());
        acc1.setAddress("Baily Road");
        System.out.println("Address: "+acc1.getAddress());
        acc1.setBalance(20000.0);
        System.out.println("Balance: "+acc1.getBalance());
        acc1.addInterest();
        System.out.println();
        
        acc2.setName("Iffat Afsara");
        System.out.println("Name: "+acc2.getName());
        acc2.setAccountID("211098");
        System.out.println("ID: "+acc2.getAccountID());
        acc2.setAddress("Khilgaon");
        System.out.println("Address: "+acc2.getAddress());
        acc2.setBalance(10000.0);
        System.out.println("Balance: "+acc2.getBalance());
        acc2.addInterest();
        System.out.println();
        
        acc3.setName("Ishadie Namir");
        System.out.println("Name: "+acc3.getName());
        acc3.setAccountID("091198");
        System.out.println("ID: "+acc3.getAccountID());
        acc3.setAddress("Baily Road");
        System.out.println("Address: "+acc3.getAddress());
        acc3.setBalance(100000.0);
        System.out.println("Balance: "+acc3.getBalance());
        acc3.addInterest();
    }
}