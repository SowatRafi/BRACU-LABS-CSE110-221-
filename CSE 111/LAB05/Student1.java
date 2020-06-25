public class Student1{
  String Name = "default name";
  static int numberOfStudents = 3;
  Student1(){
  }
  Student1(String n){
    Name = n;
  }
  public String getName(){
    return Name;
  }
}
