import java.util.Scanner; 
public class Lab12BinarySearchTree{ 
    Node root; 
    
    Lab12BinarySearchTree() {  
        root = null;  
    } 
    
    void insert(int key) { 
        root = insertRec(root, key); 
    } 
    
    Node insertRec(Node root, int key) { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key){ 
            root.right = insertRec(root.right, key); 
        }
        return root; 
    } 
    
    void inorder(){ 
        inorderRec(root); 
    } 
    
    void inorderRec(Node root){ 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key+" "); 
            inorderRec(root.right); 
        } 
    }
    
    public boolean search(Node root, int key){
        
        if (root==null){
            return false;
        }
        if(root.key==key){
            return true;
        }
        
        if (root.key > key){
            return search(root.left, key);
        }
        return search(root.right, key); 
    } 
    
    
    public static void main(String[] args){
        Scanner sd=new Scanner(System.in);
        Lab12BinarySearchTree tree = new Lab12BinarySearchTree(); 
        
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(10); 
        
        System.out.println("task 1");
        System.out.println("enter key");
        int a=sd.nextInt();
        if (tree.search(tree.root,a)==true)System.out.println("found");
        else System.out.println("not found");
        System.out.println("task 2");
        tree.inorder(); 
    } 
}