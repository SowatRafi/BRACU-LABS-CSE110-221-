/* CSE220 Lab Quiz-1*/

/* This program reads an email address from the
 * user and checks for the character '@' in the 
 * input. This check is done inside a method called 
 * check inside MyClass.Complete check() where if '@'
 * is not found in the input throw AccessDeniedException
 */
// DO NOT edit this class
import java.util.Scanner;
public class Quiz1{
  public static void main(String[]args){
    Scanner k = new Scanner(System.in);
    // reading an email address
    String x = k.nextLine();
    try{
      MyClass c = new MyClass();
      c.check(x);
    }catch (Exception e){
      System.out.println(e);
    }
  }
}
    