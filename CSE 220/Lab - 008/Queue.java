public interface Queue{
    
  public  void RegisterPatient(Object o)throws OverflowException;
    
  public Object ServePatient()throws UnderflowException;
    
  public  void CancelAll();
    
  public  boolean CanDoctorGoHome();
    
  public  void ShowAllPatient();
  
}