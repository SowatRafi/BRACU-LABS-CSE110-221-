public class Point extends Shape {
  private int my_xPos;
  private int my_yPos;

  public Point(int x, int y) {
    my_xPos = x;
    my_yPos = y;
  }  

  public int getX() {
    return my_xPos;
  }

  public int getY() {
    return my_yPos;
  }
}
