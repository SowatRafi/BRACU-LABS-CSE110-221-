public class ComplexNumber extends RealNumber{
  double imaginary;
  ComplexNumber(){
    super(1.0);
    imaginary = 1.0;
  }
  ComplexNumber(double a, double b){
    super(a);
    imaginary = b;
  }
  public String toString() {
    return "RealPart: "+getRealValue()+"\n"+"ImaginaryPart: "+imaginary;
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    ping();
    System.out.println("Checking ended");
  }
}