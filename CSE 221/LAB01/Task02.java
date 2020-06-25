
package lab01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task02 {
    void text_reader()throws FileNotFoundException{
    File file = new File("F:\\Study folder\\CSE\\CSE221\\CSE221 (Lab)\\Lab01\\in class\\Lab01\\input.txt");
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine())
        System.out.println(sc.nextLine());
    }
    void readUsingBuffer()throws FileNotFoundException{
        File file  = new File("F:\\Study folder\\CSE\\CSE221\\CSE221 (Lab)\\Lab01\\in class\\Lab01\\input.txt");
        FileReader flreader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(flreader);
        String st;
        try{
            while((st = buffer.readLine()) != null ){
                System.out.println(st);
            }
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        
    }
}
