public class BinaryTree{
    Node root;
    public BinaryTree(Node r){
    root = r;
    }
    public BinaryTree(Object[] a){
        root = insertLevelOrder(a, root, 1);
    }
    public Node insertLevelOrder(Object[] a, Node curNode, int i){ 
        if (i < a.length){ 
            curNode = new Node(a[i], null, null); 
            curNode.left = insertLevelOrder(a, curNode.left, 2 * i);
            curNode.right = insertLevelOrder(a, curNode.right, 2 * i + 1); 
        } 
        return curNode; 
    } 
    public void printInOrder(Node curNode){ 
        if (curNode != null){ 
            printInOrder(curNode.left); 
            System.out.print(curNode.element + ", "); 
            printInOrder(curNode.right); 
        } 
    } 
    public void printPreOrder(Node curNode){ 
        if (curNode != null){ 
            System.out.print(curNode.element + ", ");
            printPreOrder(curNode.left);  
            printPreOrder(curNode.right); 
        } 
    } 
    public void printPostOrder(Node curNode){ 
        if (curNode != null){ 
            printPostOrder(curNode.left);              
            printPostOrder(curNode.right); 
            System.out.print(curNode.element + ", ");
        } 
    }
    public int height(Node n){ 
        if(n == null){ 
            return 0; 
        }
        else{ 
            int lheight= height(n.left); 
            int rheight= height(n.right); 
            if(lheight > rheight){ 
                return (lheight + 1);
            }
            else{ 
                return (rheight + 1); 
            }
        }
    }
    public int level(Node n, Object data, int level){ 
        if (n == null){
            return 0;
        }
        if (n.element.equals(data)==true){
            return level;
        }
        int downlevel=level(n.left,data,level+1);
        if (downlevel!=0){
            return downlevel;
        }
        downlevel=level(n.right,data,level+1);
        return downlevel; 
    } 
    public int getLevel(Node node, Object data)  
    { 
        return level(node, data, 1); 
    } 
    public Node copyTree(Node newroot,Node oldroot){
        if (oldroot != null){
        newroot = new Node(oldroot.element, null, null);
        newroot.left = copyTree(newroot.left, oldroot.left);
        newroot.right = copyTree(newroot.right, oldroot.right);
        return newroot;
        }
        return null;
    }
    public boolean sameOrNot(Node newr,Node oldr){
        if(newr == null && oldr == null){
        return true;
        }
        else if (newr != null && oldr != null){
        return (newr.element==oldr.element && sameOrNot(newr.left,oldr.left) && sameOrNot(newr.right,oldr.right));
        }
        else{
        return false;
        }
    }
}