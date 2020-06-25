public class Rectangle extends Shape{
  private int length;
  private int width;
  Rectangle(int a, int b){
    length = a;
    width = b;
  }
  public void area(){
    double area = length*width;
  }
  public String toString(){
    return "Rectangle";
  }
}