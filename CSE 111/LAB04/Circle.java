public class Circle{
  private double radius = 1.0;
  private String color = "red";
  public Circle(){
  }
  public void setRadius(double r){
    radius = r;
  }
//  public void setColor(String c){
//    color = c;
//  }
  public double getRadius(){
    return radius;
  }
  public double getArea(){
    double area = 3.1416*radius*radius;
    return area;
  }
}