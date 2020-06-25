import java.util.Scanner;
public class Tester{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int selection;
        while(true){
            try{
                System.out.println("Please, enter;\n1 to select WRMcirarray \n2 to select WRMlinked  ");
                selection=sc.nextInt(); 
                if(selection!=1 && selection!=2){
                    System.err.println("Wrong selection! Please try again.");
                }
                else break;
            }
            catch(Exception e){
                System.err.println("Input format mismatch!Please try again");
                sc.next();
            }
        }
        
        Queue q;
        if(selection==1) q = new WRMcirarray();
        else q=new WRMlinked();
        
        System.out.println("Total no. of patients :");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            System.out.println("Please register patient no."+i);
            count++;
            System.out.println("Name:");
            System.out.println("Age:");
            System.out.println("Blood Group:"); 
            sc.nextLine();
            String nm=sc.nextLine();
            int ag=sc.nextInt();
            sc.nextLine();
            String bgrp=sc.next();
            Patient p=new Patient(nm,ag,bgrp);
            int id=18000+i;
            String s = "Name: "+p.name+" ID: "+id+" Age: "+p.age+" Blood Group: "+p.bgr;
            try{
                q.RegisterPatient(s);
            }
            catch(OverflowException e){
            }
        }
        
        System.out.println("Information of all patients : ")  ;
        q.ShowAllPatient();
        try{
            System.out.println("Call a patient");
    q.ServePatient();
//    System.out.println("Call a patient");
//    q.ServePatient();
        }catch(UnderflowException e){
        }
        
        System.out.println("Information of all patients : ")  ;
        q.ShowAllPatient();
        
        boolean b=q.CanDoctorGoHome();
        if(b==true){
            System.out.println("No patient.Doctor can go home.");
        }
        else{
            System.out.println("Patients waiting.Doctor can't go home.");
        }
        
        
        q.CancelAll();
        
        boolean bol=q.CanDoctorGoHome();
        if(bol==true)System.out.println("No patient.Doctor can go home.");
        else System.out.println("Patients waiting.Doctor can't go home.");
        
    }
}
