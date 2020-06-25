public class CricketTeam extends Team{
  public CricketTeam(String n, String m){
   super(n,m);
  }

  public String toString(){
    return "Our name is "+name+"\n"+"We play Cricket";
  }
  public void getMascot(){
    System.out.print("Our cricket team mascot name is ");
    super.getMascot();
  }
}