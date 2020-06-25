public class StudentTest{
  public static void main(String [] args){
    Student1 s1 = new Student1();
    System.out.println(s1.getName());

    Student1 s2 = new Student1("Matin");
    System.out.println(s2.getName());

    Student1 s3 = new Student1("Saad");
    System.out.println(s3.getName());
    System.out.println(Student1.numberOfStudents);
  }
}
