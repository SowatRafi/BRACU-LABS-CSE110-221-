import java.util.*; 
public class MyReader{ 
    //modify following line so that this method can throw Exception 
    int readInteger( ) throws EitaIntegerNoiException { 
        Scanner k = new Scanner(System.in); 
        
        int answer; 
        
        String s = k.next(); 
        if (s.contains(".")){ 
            EitaIntegerNoiException e = new EitaIntegerNoiException();
            throw e;
            
        }else{  
            answer = Integer.parseInt(s);
            return answer;
        } 
        
    } 
}