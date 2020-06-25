public class studentTester{
  public static void main(String args[]){
    student john = new student();
    john.setName("John");
    john.setID("123");
    john.setAddress("Banani");
    john.setCGPA(3.99);
    System.out.println(john.getName());
    System.out.println(john.getID());
    System.out.println(john.getAddress());
    System.out.println(john.getCGPA());
    System.out.println("-------------");
    student mike = new student();
    mike.setName("Mike");
    mike.setID("456");
    mike.setAddress("Gulshan");
    mike.setCGPA(3.88);
    System.out.println(mike.getName());
    System.out.println(mike.getID());
    System.out.println(mike.getAddress());
    System.out.println(mike.getCGPA());
    System.out.println("-------------");
    student carol = new student();
    carol.setName("Carol");
    carol.setID("789");
    carol.setAddress("Motijheel");
    carol.setCGPA(3.77);
    System.out.println(carol.getName());
    System.out.println(carol.getID());
    System.out.println(carol.getAddress());
    System.out.println(carol.getCGPA());
  }
}