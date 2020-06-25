public class Cylinder extends Shape{
  private int length;
  private int radius;
  Cylinder(int l, int r){
    length = l;
    radius = r;
  }
  public void area(){
    double area = Math.PI*radius*radius*length;
  }
  public String toString(){
    return "Cylinder";
  }
}