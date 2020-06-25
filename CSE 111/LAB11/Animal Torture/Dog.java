public class Dog extends Animal implements SoundSource{
  public String Sound;
  Dog(String n){
    super(n);
  }
  public void makeSound(){
    System.out.println(getName()+" is crying");
  }
}