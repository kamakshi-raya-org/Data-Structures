package linkedlist2;
import java.util.Scanner;
public class q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList A=new LinkedList();
		int y=1;
		System.out.println("Enter the details of Linked List-1 :");
		while(y==1) {
			System.out.print("enter the number : ");
			int x=in.nextInt();
			A.insert(x);
			System.out.println("would you like to add another number to the list?\n1.yes\n2.no");
			y=in.nextInt();
		}
		LinkedList B=new LinkedList();
		y=1;
		System.out.println("Enter the details of Linked List-2 :");
		while(y==1) {
			System.out.print("enter the number : ");
			int x=in.nextInt();
			A.insert(x);
			System.out.println("would you like to add another number to the list?\n1.yes\n2.no");
			y=in.nextInt();
		}
		A.join(A, B);
		in.close();
	}

}
