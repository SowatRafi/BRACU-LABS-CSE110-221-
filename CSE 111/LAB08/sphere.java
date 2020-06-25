class sphere extends Point{
  sphere(double n){
    super (n);
    System.out.println("Creating a Sphere … done!");
    System.out.println("The area of the Sphere is "+space());
  }
  double space(){
    double area = 4/3*Math.PI*getRadius()*getRadius()*getRadius();
    return area;
  }
}