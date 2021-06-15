package linkedlist2;
import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList list=new LinkedList();
		int y=1;
		while(y==1) {
			System.out.print("enter the number : ");
			int x=in.nextInt();
			list.insert(x);
			System.out.println("would you like to add another number to the list?\n1.yes\n2.no");
			y=in.nextInt();
		}
		System.out.print("Original ");
		list.printalist(list);
		list.unduplicate();
		System.out.print("\nConverted ");
		list.printalist(list);
		in.close();
	}

}
