public class Part02Task06Square{
    public double height;
    public double width;
    public double area;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        area = height*width;
        return area;
    }
}