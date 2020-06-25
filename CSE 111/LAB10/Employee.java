public class Employee extends Person{
  EmpolyeeRecord r;
  Employee(String s, double d, int y, String nid){
    r= new EmpolyeeRecord();
    super.setName(s);
    r.setYear(y);
    r.setSalary(d);
    r.setNID(nid);
    
    
  }
  public void setSalary(double a){
    r.setSalary(a);
  }
  public double getSalary(){
    return r.getSalary();
  }
  public void setYear(int y){
    r.setYear(y);
  }
  public int getYear(){
    return r.getYear();
  }
  public void setNID(String n){
    r.setNID(n);
  }
  public String getNID(){
    return r.getNID();
  }
//  public boolean equals(Employee e2){
//    if()
  
  
}
