public class Author{
  public String firstname;
  private String lastname;
  public void setFirstName(String n){
    firstname = n;
  }
  public void setLastName(String m){
    lastname = m;
  }
//  public String getFirstName(){
//    return firstname; 
//  }
//  public String getLastName(){
//    return lastname;
  //}
  public String toString(){
    return firstname+" "+lastname;
  }
}
