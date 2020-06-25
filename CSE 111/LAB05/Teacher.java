public class Teacher{
  String name;
  String dept;
  String S = "";
  Teacher(String n, String d){
    name = n;
    dept = d;
  }
  public void addCourse(Course c){
    S += c.CourseName+"\n";
  }
  public void printDetail(){
    System.out.println("========================");
    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("List of courses");
    System.out.println("========================");
    System.out.print(S);
    System.out.println("========================");
  }
}
