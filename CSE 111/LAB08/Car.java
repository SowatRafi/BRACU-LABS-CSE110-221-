public class Car{
  public int year;
  static int i;
  public static int getObjectCount(){
    
    return i;
  }
  Car(int j){
    year = j;
   i++;
  }
  public int getYear(){
    return year;
  }
}
                      