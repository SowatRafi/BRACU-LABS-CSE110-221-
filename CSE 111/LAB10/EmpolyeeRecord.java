public class EmpolyeeRecord extends Person{
  private double sal;
  private int yr;
  private String nid;
  public void setSalary(double a){
    sal = a;
  }
  public double getSalary(){
    return sal;
  }
  public void setYear(int y){
    yr = y;
  }
  public int getYear(){
    return yr;
  }
  public void setNID(String n){
    nid = n;
  }
  public String getNID(){
    return nid;
  }
}