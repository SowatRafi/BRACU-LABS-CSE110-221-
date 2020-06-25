import java.util.Scanner;
public class DateTest{
    public static void main (String[] args){ 
        Part02Task08Date display = new Part02Task08Date (0,0,0);
        Scanner input = new Scanner (System.in);
        int month;
        int day;
        int year; 
        System.out.print ("Please enter month: ");
        month = input.nextInt();
        display.setMonth(month);
        System.out.println ();
        System.out.print ("Please enter day: ");
        day = input.nextInt();
        display.setday(day);
        System.out.println (); 
        System.out.print ("Please enter year: ");
        year = input.nextInt();
        display.setYear(year);
        System.out.println ();
        display.displayDate();
    }
}