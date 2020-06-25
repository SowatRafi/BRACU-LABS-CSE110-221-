public class Animal{
  public String name;
  Animal(String s){
  System.out.println("Name: "+s);
  }
  public String getName(String s){
    return "Name of the animal";
  }
  public void makeNoise(){
    System.out.println("Bark");
  }
}