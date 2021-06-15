package lab9;
import java.util.Scanner;
class bstnode{
	int data;
	bstnode left,right;
	bstnode(int data){
		this.data=data;
	}
}
class BST{
	bstnode root;
	private bstnode insert(bstnode node,int data) {
		if(node==null) {
			return new bstnode(data);
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
	public void printlargest() {
		bstnode temp=root;
		while(temp.right!=null) {
			temp=temp.right;
		}
		System.out.println("The largest number of the tree is "+temp.data);
	}
	public void preorder(bstnode node) {
		if (node != null) {
	        System.out.print(node.data+" ");
	        preorder(node.left);
		    preorder(node.right);
	    }
	}
	public void inorder(bstnode node) {
		if (node != null) {
			inorder(node.left);
	        System.out.print(node.data+" ");
		    inorder(node.right);
	    }
	}
	public void postorder(bstnode node) {
		if (node != null) {
			System.out.print(node.data+" ");
			postorder(node.left);       
		    postorder(node.right);
	    }
	}
	public static int addnodes(bstnode node) {
		if(node==null) {
			return 0;
		}
		return (node.data+addnodes(node.left)+addnodes(node.right));
	}
	public void sum(bstnode node) {
		if (node==null) {
			return;
		}		
	    preorder(node.left);    
	    preorder(node.right);
	}
}
public class a2 {
	static int sum(bstnode node) {
		if(node==null) {
			return 0;
		}
		return(node.data+sum(node.left)+sum(node.right));
	}
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		BST b=new BST();
		int ans=0;
		int data;
		while(ans!=7) {
			System.out.print("Choose an option >\n1.Insert\n2.Pre-order\n3.In-order\n4.Post-order\n5.Sum\n6.Get largest value\n7.Exit > ");
			ans=in.nextInt();
			System.out.println();
			switch (ans){
			case 1:
				System.out.print("Enter the number : ");
				data=in.nextInt();
				b.Insertion(data);
				System.out.println();
				break;
			case 2:
				System.out.println("Pre-order traversal : ");
				b.preorder(b.root);
				System.out.println();
				break;
			case 3:
				System.out.println("In-order traversal : ");
				b.inorder(b.root);
				System.out.println();
				break;
			case 4:
				System.out.println("Post-order traversal : ");
				b.postorder(b.root);
				System.out.println();
				break;
			case 5:
				int sum=sum(b.root);
				System.out.println("Sum of all the numbers in the tree is "+sum);
				System.out.println();
				break;
			case 6:
				b.printlargest();
				System.out.println();
			}
		}
		System.out.println(b.root.data);
		in.close();
	}
}
