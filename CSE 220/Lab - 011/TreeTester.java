public class TreeTester{
    
    public static void main(String[] args) {
        Object[] a = {'0', 'b', 'e', 'p', 'q', 'z', 'x', 'u', 'v', 'y', 'g', 'h', 'j', 'k', 'm', 'n','t'}; 
        BinaryTree bt = new BinaryTree(a);
        System.out.print("In Order: ");
        bt.printInOrder(bt.root);
        System.out.println();
        
        System.out.print("Pre Order: ");
        bt.printPreOrder(bt.root);
        System.out.println();
        
        System.out.print("Post Order: ");
        bt.printPostOrder(bt.root);
        System.out.println();
        
        System.out.println("Height of tree is : " +  bt.height(bt.root)); 
        
        System.out.println("Level of " + "j" + " is "+ bt.getLevel(bt.root, 'j'));
        
        
        Node newrt=new Node(9,null,null);
        Node nroot=bt.copyTree(newrt,bt.root);
        System.out.print("Post Order: ");
        bt.printPostOrder(nroot);
        System.out.println();
        
        Object[] a2 = {'0', 'b', 'e', 'p', 'q', 'z', 'x', 'u', 'v', 'y', 'g', 'h', 'j', 'k', 'm', 'n','t'}; 
        BinaryTree bt1 = new BinaryTree(a2);
        System.out.println(bt.sameOrNot(bt1.root,bt.root));
        
        Object[] a3 = {'0', 'b', 'e', 'p', 'q', 'z', 'y', 'u', 'v', 'y', 'g', 'h', 'j', 'k', 'm', 'n','t'};
        BinaryTree bt2 = new BinaryTree(a3);
        System.out.println(bt.sameOrNot(bt2.root,bt.root));
    }
    
}