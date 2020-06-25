public class Sphere extends Shape{
  private int radius;
  Sphere(int r){
    radius = r;
  }
  public void area(){
    double area = 4*Math.PI*radius*radius;
  }
   public String toString(){
    return "Sphere";
  }
}