public class Trim{
  public static char [] Trim(char [] input){
    char [] output = new char [input.length];
    output[0] = input[0];
    int i = 1;
    for(int j=1; j<input.length; j++){
      if(input[j]==32){
        if(output[i-1]!=32){
        }
        output[i] = input[j];
        i++;
      }
      else{
        output[i] = input[j];
      }
    }
    return output;
  }
}


