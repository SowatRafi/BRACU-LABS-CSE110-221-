public class Tester{
    public static void main(String[] args){
        Lab10Task06 b = new Lab10Task06();
        int a[] = {18,3,19,98,21,22};
        if (b.contains(a,0,a.length-1,18)==true){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}