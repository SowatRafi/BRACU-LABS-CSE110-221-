import java.util.Scanner;
public class happyNumber
{
  public static void main(String []args)
  {
    Scanner k= new Scanner(System.in);
    System.out.println("give me any awesome number please");
    int  n=k.nextInt();
    int product=1; 
    while (n>=n){
      product =n*n;
    }
    if(product/10==0){
      
    }
  }
}
