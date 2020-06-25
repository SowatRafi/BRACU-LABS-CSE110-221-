public class Vehicle{
  private int x;
  private int y;
  public Vehicle(){
    x=0;
    y=0;
  }
  public String toString(){
    return "("+x+", "+y+")";
  }
  void moveUp(){
    y++;
  }
  void moveDown(){
    y--;
  }
  void moveLeft(){
    x--;
  }
  void moveRight(){
    x++;
  }
}