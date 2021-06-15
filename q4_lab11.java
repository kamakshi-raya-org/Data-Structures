package lab11;
import java.util.Scanner;
public class q4 {
    public static void main(String[]args) {
    	Scanner in=new Scanner(System.in);
		tree t=new tree();
		int ans=0;
		int data;
		while(ans!=4) {
			System.out.print("Choose an option >\n1.Insert\n2.Delete\n3.Show All Paths\n4.Exit > ");
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
				 t.printPaths(t.root);
			}
		}
		in.close();
    }
}
