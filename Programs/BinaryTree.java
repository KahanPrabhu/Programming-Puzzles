import java.util.*;
import java.io.*;
class Node
{
    Node left;
    Node right;
    int data;
    
    public Node()
    {
        left=null;
        right=null;
        data=0;
    }
    
    public Node(int n)
    {
        left=null;
        right=null;
        data=n;
        
    }
    
    public void setLeft(Node n)
    {
        left=n;
    }
    
    public void setRight(Node n)
    {
        right=n;
    }
    
    public Node getLeft()
    {
        return this.left;
    }
    
    public Node getRight()
    {

        return this.right;
    }
    
    public void setData(int n)
    {
        data = n;
    }
    
    public int getData()
    {
        return this.data;
    }
}
    
    


class Tree
{
    
     Node root;
    
    public Tree()
    {
        root=null;
    }
    
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(int data)
    {
        root = insert(root, data);
    }
    
    private Node insert(Node node, int data)
    {
        
        if(node == null)
            node = new Node(data);
        else
        {
          if(node.getRight() == null)
            node.right = insert(node.right, data);
            
          else
            node.left= insert(node.left, data);
        }
        
        return node;
        
        
    }
    
    public int countNodes()
    {
        return countNodes(root);
    }
    
    private int countNodes(Node r)
    {   
        if(r == null)
            return 0;
        else
        {
            int count=1;
            count=count+countNodes(r.getLeft());
            count=count+countNodes(r.getRight());
            return count;
            
        }
        
    }
    
    public boolean search(Node r, int val)
    {
        if(r.getData() == val)
            return true;
            
        if(r.getLeft()!=null)
            if(search(r.getLeft(),val))
            return true;
            
            
        if(r.getRight()!=null)
            if(search(r.getRight(),val))
            return true;
        
        return true;
        
    }
    
    
    public void inorder()
    {
        
        inorder(root);
    }
    
    private void inorder(Node r)
    {
        if(r!=null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData()+" ");
            inorder(r.getRight());
        }
        
    }
    
    
    public void preorder()
    {
        preorder(root);
    }
    
    
    private void preorder(Node r)
    {
        if(r!=null)
        {
            System.out.print(r.getData()+" ");
            preorder(r.getLeft());
            preorder(r.getRight());
            
        }
        
    }
    
    
    public void postorder()
    {
        postorder(root);
    }
    
    private void postorder(Node r)
    {
        if(r!=null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData()+" ");
            
        }
    }
}


public class BinaryTree
{
    public static void main()throws IOException
    {
    Scanner scan =new Scanner(System.in);
    Tree tree=new Tree();
    System.out.println("Binary Tree test");
    char ch;
    
    do
    {
        System.out.println("\nBinary Tree Operations\n");
        System.out.println("1. insert ");
        System.out.println("2. search");
        System.out.println("3. count nodes");
        System.out.println("4. check empty");
            
        int choice =scan.nextInt();
        
        
        switch(choice)
        {
            case 1:
            System.out.println("Enter integer element to insert");
            tree.insert(scan.nextInt());
            break;
            
            case 2 : 
            System.out.println("Enter integer element to search");
            System.out.println("Search result : "+ tree.search(tree.root,scan.nextInt()));
            break;                                          
            
            case 3 : 
            System.out.println("Nodes = "+ tree.countNodes());
            break;  
            
            case 4 : 
            System.out.println("Empty status = "+ tree.isEmpty());
            break;            
            
            default : 
            System.out.println("Wrong Entry \n ");
            break;   
        }
        
        System.out.print("\nPost order : ");
            tree.postorder();
            System.out.print("\nPre order : ");
            tree.preorder();
            System.out.print("\nIn order : ");
            tree.inorder();
            
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
    }
 
        
        
        
        

    
    








