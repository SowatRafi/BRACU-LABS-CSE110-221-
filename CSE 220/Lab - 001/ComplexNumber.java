public class ComplexNumber extends RealNumber {
    private double complexValue;
    public double getComplexValue() {
        return complexValue;
    }
    public void setComplexValue(double c) {
        complexValue = c;
    }
    public ComplexNumber() {
      this(1.0);
      setRealValue(1.0);
    }
    
    public ComplexNumber(double c) {
        setComplexValue(c);
    }
    
    public ComplexNumber(double r, double c) {
        super(r);
        setComplexValue(c);
    }
    
    public String toString() {
//      System.out.println(super.toString());
      return super.toString() +"\n"+ "ImaginaryPart: "+getComplexValue();
    }
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
    
    public void check(){
      ping();
      super.ping();
    }
}