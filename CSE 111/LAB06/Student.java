public class Student{
  String name = "Ei name e kono student nai";
  String id = "Student ei nai, abar id :P";
  String address = "Naam nai .. thikana ashbe koi theke?";
  double cgpa = -4.0;
  Student(){
  }
  Student(String n, String a, String i, double c){
    name = n;
    address = a;
    id = i;
    cgpa = c;
  }
  public String nameDao(){
    return name;
  }
  public String boloToAmiKe(){
    return id;
  }
  public String addressDao(){
    return address;
  }
  public double cgpaDao(){
    return cgpa;
  }
  public void nameBoshao(String n){
    name = n;
  }
  public void addressBoshao(String a){
    address = a;
  }
  public void idBoshao(String i){
    id = i;
  }
  public void cgpaBoshao(double c){
    cgpa = c;
  }
  public void standUp(){
    System.out.println(this.name+" is now standing up!!");
  }
  public String tellMeYourName(){
    return "Sir, my name is "+this.name;
  }
  public void call(String w){
    name = w;
    System.out.println(this.name+": Hey, "+w+", Sir is calling you!!");
  }
  public int add2Numbers(int a, int b){
    return a+b;
  }
}