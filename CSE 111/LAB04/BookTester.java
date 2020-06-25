public class BookTester{
  public static void main(String args[]){
    Book b = new Book();
    b.setTitle("Developing Java Software");
    b.setAuthor("Russel Winderand");
    b.setPrice(79.75);
    System.out.println(b.toString());
  }
}