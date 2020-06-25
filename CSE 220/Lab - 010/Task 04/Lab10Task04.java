public class Lab10Task04{
    public void selectionSort(Node h){
        Node j=null;
        for (Node i=h; i!=null; i=i.next){
            Object min = i.element;;
            for (j=i.next; j!=null; j=j.next){
                if ((int)j.element < (int)min){
                    min = j.element;
                } 
                if (min != i.element){
                    j.element = i.element;
                    i.element = min;
                }
            } 
        }
        for (Node n=h; n!=null; n=n.next){
            System.out.print(n.element+ " ");
        }  
    }
}