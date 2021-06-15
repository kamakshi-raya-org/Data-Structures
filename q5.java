package linkedlist2;
import java.util.Scanner;
public class q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList list=new LinkedList();
		int ans=1;
		while(ans==1) {
			System.out.print("enter the number : ");
			int x=in.nextInt();
			list.insert(x);
			System.out.println("would you like to add another number to the list?\n1.yes\n2.no");
			ans=in.nextInt();
		}
		System.out.print("enter the first key : ");
		int x=in.nextInt();
		System.out.print("\nenter the second key : ");
		int y=in.nextInt();
		System.out.print("Original ");
		list.printalist(list);
		list.swap(x,y);
		System.out.print("\nSwapped ");
		list.printalist(list);
		in.close();
	}

}
