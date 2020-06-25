public class Vehicle2010 extends Vehicle{
  Vehicle2010(){
    x=0;
    y=0;
  }
  void moveUpperRight(){
    y++;
    x++;
  }
  void moveUpperLeft(){
    y++;
    x--;
  }
  void moveLowerRight(){
    y--;
    x++;
  }
  void moveLowerLeft(){
    y--;
    x--;
  }
  boolean Equals(){
    if (car.equals(car2)) System.out.println(true);
    else System.out.println (false);
  }
}