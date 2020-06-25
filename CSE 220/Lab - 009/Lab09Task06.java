public class Lab09Task06 {
   public static void main (String[] args) {
      Object a[] = {10, 20, 30, 40, 50};
      LinkList li = new LinkList(a);
      Node m=li.head;
      li.printList(m);
   }
}