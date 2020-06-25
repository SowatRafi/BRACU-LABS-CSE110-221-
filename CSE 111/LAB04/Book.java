public class Book{
  public String title;
  public String author;
  public double price;
  
  public void setTitle(String t){
    title = t;
  }
  public void setAuthor(String a){
    author = a;
  }
  public void setPrice(double p){
    price = p;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public double getPrice(){
    return price;
  }
  public String toString(){
    return title+" " +author+" "+price; 
    
  }
}