package lab11;
import java.util.Scanner;
public class q3 {
	static int maxdiff;
	  public static int maxdiff(Node root) {
	        if (null==root) {
	        	return 0;
	        }
	        maxdiff=0;
	        diff(root,root.data,root.data);
	        return maxdiff;
	    }
	    public static void diff(Node root,int min,int max) {
	        if (root==null) {
	        	return;
	        }
	        int diff1=Math.abs(root.data-min);
	        int diff2=Math.abs(root.data-max);
	        maxdiff=Math.max(maxdiff,diff1);
	        maxdiff=Math.max(maxdiff,diff2);
	        diff(root.left,Math.min(min,root.data),Math.max(max,root.data));
	        diff(root.right,Math.min(min,root.data),Math.max(max,root.data));
	    }
	   public static void main(String[]args) {
			Scanner in=new Scanner(System.in);
			tree t=new tree();
			int ans=0;
			int data;
			while(ans!=4) {
				System.out.print("Choose an option >\n1.Insert\n2.Delete\n3.Max Difference\n4.Exit > ");
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
					System.out.println("The maximum difference is "+ maxdiff(t.root));
				}
			}
			in.close();
	   }
}
