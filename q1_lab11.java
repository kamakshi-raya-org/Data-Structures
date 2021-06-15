package lab11;
import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
}
class tree{
	Node root;
	private Node insert(Node node,int data) {
		if(node==null) {
			return new Node(data);
		}
		if(data<node.data) {
			node.left=insert(node.left,data);
		}
		else if(data>node.data) {
			node.right=insert(node.right,data);
		}
		else {
			return node;
		}
		return node;
	}
	public void Insertion(int data) {
	    root=insert(root,data);
	}
	private Node findSmallestleft(Node root) {
		Node temp=root;
	    while(temp.left!=null) {
	    	temp=temp.left;
	    }
	    return temp;
	}
	void printPaths(Node node)  { 
        int path[]=new int[1000]; 
        printPathsRecur(node,path,0); 
    } 
    void printPathsRecur(Node node,int path[],int pathLen)  { 
        if (node==null) {
        	return; 
        }   
        path[pathLen]=node.data; 
        pathLen++; 
        if (node.left==null && node.right==null) {
            printArray(path,pathLen); 
        }
        else { 
            printPathsRecur(node.left,path,pathLen); 
            printPathsRecur(node.right,path,pathLen); 
        } 
    } 
    void printArray(int ints[],int len)  { 
        for (int i=0;i<len;i++)  { 
            System.out.print(ints[i]+" "); 
        } 
        System.out.println(""); 
    }  
	public Node delete(Node node,int data) {
	    if (node==null) {
	        return null;
	    }
	    if (data==node.data) {
	    	if (node.left==null && node.right==null) {
	    	    return null;
	    	}
	    	else if (node.right==null) {
	    	    return node.left;
	    	}
	    	else if (node.left==null) {
	    	    return node.right;
	    	}
	    	else {
	    		int smallest=findSmallestleft(node.right).data;
	    		node.data=smallest;
	    		node.right=delete(node.right,smallest);
	    		return node;
	    	}
	    } 
	    if (data<node.data) {
	        node.left=delete(node.left,data);
	        return node;
	    }
	    node.right=delete(node.right,data);
	    return node;
	}
	public void Deletion(int data) {
	    root=delete(root,data);
	}
	
}
public class q1 {
	static boolean full(Node node) { 
        if(node==null) {
            return true; 	
        }
        if(node.left==null && node.right==null) {
            return true; 
        }
        if((node.left!=null) && (node.right!=null)) { 
            return (full(node.left) && full(node.right)); 
        }
        return false; 
    } 
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		tree t=new tree();
		int ans=0;
		int data;
		while(ans!=4) {
			System.out.print("Choose an option >\n1.Insert\n2.Delete\n3.Check\n4.Exit > ");
			ans=in.nextInt();
			switch (ans){
			case 1:
				System.out.print("Enter the number : ");
				data=in.nextInt();
				t.Insertion(data);
				System.out.println();
				break;
			case 2:
				System.out.print("Enter the data : ");
				int x=in.nextInt();
				t.Deletion(x);
				break;
			case 3:
				if(full(t.root)) {
					System.out.println("The tree is full");
				}
				else {
					System.out.println("The tree is not full");
				}
			}
		}
		in.close();
	}
}
