public class LinkList {
   Node head;
   Node tail;
   int count=0;
   LinkList(Object a[]) {
      Node n= new Node(a[0], null);
      head=n;
      tail=n;
      for (int i=1; i<a.length; i++) {
         n = new Node (a[i], null);
         tail.next=n;
         tail = tail.next;
      }
      for (Node j=head; j!=null; j=j.next) {
         count++;
      }
   }
   Object printList(Node m) {
      if (m==null) {
         return 1;
      } else {
         System.out.print(m.element+", ");
         printList(m.next);
         return 1;
      }
   }
   Object printReverseList(Node m) {
      if (m==null) {
         return 1;
      } else {
         Node j=head;
         for (int i=1; i<count; i++) {
            j=j.next;
         }
         System.out.print(j.element+", ");
         count--;
         printReverseList(m.next);
         return 1;
      }
   }
}
         