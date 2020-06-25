public class student{
  public String name;
  public String address;
  public String id;
  public double cgpa;
  public void setName(String n){
    name = n;
  }
  public void setAddress(String a){
    address = a;
  }
  public void setID(String i){
    id = i;
  }
  public void setCGPA(double c){
    cgpa = c;
  }
  public String getName(){
    return name;
  }
  
  public String getID(){
    return id;
  }
  
  public String getAddress(){
    return address;
  }
  
  public double getCGPA(){
    return cgpa;
  }
}