package lab8;
import java.util.Scanner;
class cnode{
	char data;
	cnode next;
	cnode prev;
	cnode(char c){
		this.data=c;
	}
}
class texteditor{
	cnode head;
	int i;
	cnode cursor;
	public void insert(char c) {
		cnode node=new cnode(c);
		if(head==null) {
			node.next=null;
			node.prev=null;
			head=node;
			cursor=head;
		}
		else if(cursor==head && cursor.next==null && i!=1) {
			node.prev=cursor;
			node.next=null;
			cursor.next=node;
			right();
		}
		else if(cursor!=head && cursor.next==null) {
			cursor.next=node;
			node.prev=cursor;
			node.next=null;
			right();
		}
		else if(cursor.next!=null && i!=1) {
			node.prev=cursor;
			node.next=cursor.next;
			cursor.next.prev=node;
			cursor.next=node;
			right();
		}
		else if(i==1 && cursor==head) {
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
			right();
		}
		printstring();
		cursor();
	}
	public void delete(){
		if(cursor==head) {
			head=head.next;
			head.prev=null;
		}
		else if(cursor==head && cursor.next==null) {
			head=null;
			head.next=null;
			head.prev=null;
		}
		else if(cursor.next!=null && cursor.next.next!=null) {
			cursor.next.next.prev=cursor;
			cursor.next=cursor.next.next;
		}
		else if(cursor.next!=null && cursor.next.next==null) {
			cursor.next=null;
		}
		printstring();
		cursor();
	}
	public void left(){
		if(cursor!=head) {
			cursor=cursor.prev;
			i=0;
		}
		else {
			i=1;
		}
		
	}
	public void right() {
		if(cursor.next!=null) {
			cursor=cursor.next;
		}
	}
	public void printstring() {
		cnode temp=head;
		System.out.print("The text : ");
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public void cursor() {
		if(cursor.next!=head) {
			System.out.println("The cursor is at "+cursor.data);
		}
		else {
			System.out.println("The cursor is at "+head.data);
		}
	}
}
public class q2{
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		texteditor t=new texteditor();
		int ans=0;
		while(ans!=7) {
			System.out.println();
			System.out.print("Choose an option >\n1.Insert\n2.Delete\n3.Move Left\n4.Move Right\n5.Show Text\n6.Highlight Cursor\n7.Exit > ");
			ans=in.nextInt();
			System.out.println();
			switch (ans){
			case 1:
				in.nextLine();
				System.out.print("Enter the character : ");
				String x=in.nextLine();
				char c=x.charAt(0);
				t.insert(c);
				break;
			case 2:
				t.delete();
				break;
			case 3:
				t.left();
				t.cursor();
				break;
			case 4:
				t.right();
				t.cursor();
				break;
			case 5:
				t.printstring();
				break;
			case 6:
				t.cursor();
				break;
			}
		}
		in.close();
	}
}