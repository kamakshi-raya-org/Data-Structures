package lab9;
import java.util.Scanner;
class CustomerTree{
	class Node{
		String name;
		int age;
		Node left,right;
		Node(String name,int age){
			this.name=name;
			this.age=age;
		}
	}
	Node root;
	private Node insert(Node node,int age,String name) {
	    if(node==null) {
	        return new Node(name,age);
	    }
	    if(name.compareTo(node.name)<0) {
	    	 node.left=insert(node.left,age,name);
	    }
	    else if(name.compareTo(node.name)>0) {
	        node.right=insert(node.right,age,name);
	    } 
	    else {
	    	if(age>node.age) {
	    		node.right=insert(node.right,age,name);
	    	}
	    	else if(age<node.age) {
	    		node.left=insert(node.left,age,name);
	    	}
	    }
	    return node;
	}
	public void Insertion(String name,int age) {
	    root=insert(root,age,name);
	}
	public void Printing(Node node) {
	    if (node==null) {
	    	return;
	    }
	    Printing(node.left);
	    System.out.print(node.name+"\t\t  "+node.age);
	    System.out.println();
	    Printing(node.right);
	    
	}
	private Node findSmallest(Node root) {
		Node temp=root;
	    while(temp.left!=null) {
	    	temp=temp.left;
	    }
	    return temp;
	}
	private Node delete(Node node,String name) {
	    if (node==null) {
	        return null;
	    }
	    if (name.equalsIgnoreCase(node.name)) {
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
	    		String smallestname=findSmallest(node.right).name;
	    		int smallestage=findSmallest(node.right).age;
	    		node.name=smallestname;
	    		node.age=smallestage;
	    		node.right=delete(node.right,smallestname);
	    		return node;
	    	}
	    } 
	    if (name.compareTo(node.name)<0) {
	        node.left=delete(node.left,name);
	        return node;
	    }
	    node.right=delete(node.right,name);
	    return node;
	}
	public void Deletion(String name) {
	    root=delete(root,name);
	}
}
public class a1 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		CustomerTree t=new CustomerTree();
		int ans=0;
		String name;
		int age;
		while(ans!=4) {
			System.out.println();
			System.out.print("Choose an option >\n1.Inserting\n2.Deleting\n3.Printing\n4.Exit > ");
			ans=in.nextInt();
			System.out.println();
			switch (ans){
			case 1:
				in.nextLine();
				System.out.print("Enter the Customer's Name : ");
				name=in.nextLine();
				System.out.print("Enter the Customer's Age : ");
				age=in.nextInt();
				t.Insertion(name,age);
				break;
			case 2:
				String x=in.nextLine();
				System.out.print("Enter the Customer's Name : ");
				name=in.nextLine();
				t.Deletion(name);
				break;
			case 3:
				System.out.println("Name\t\t\t  Age");
				System.out.println("--------------------------------");
				t.Printing(t.root);
				System.out.println("--------------------------------");
				break;
			}
		}
		in.close();
	}
}
