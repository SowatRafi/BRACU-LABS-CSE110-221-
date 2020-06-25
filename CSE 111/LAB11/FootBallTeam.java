public class FootBallTeam extends Team{
  FootBallTeam(String n, String m){
    super(n,m);
   
  }

  public String toString(){
    return "Our name is "+name+"\n"+"We play Football";
  }
  public void getMascot(){
    System.out.println("Our football team mascot name is ");
    super.getMascot();
  }
}