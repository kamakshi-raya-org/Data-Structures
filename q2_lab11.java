package lab11;
import java.util.Scanner;
public class q2 {
	static int nodes(Node root) { 
        if (root == null) {
            return (0); 
        }
        return (1+nodes(root.left)+nodes(root.right)); 
    } 
    static boolean complete(Node root,int index,int nodes) { 
        if (root==null) {        
           return true; 
        }
        if (index>=nodes) {
           return false; 
        }
        return (complete(root.left,2*index+1,nodes) && complete(root.right,2*index+2,nodes)); 
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
				int n=nodes(t.root); 
		        int index=0; 
				if(complete(t.root,index,n)) {
					System.out.println("The tree is a complete binary tree");
				}
				else {
					System.out.println("The tree is not a complete binary tree");
				}
			}
		}
		in.close();
    }
}
