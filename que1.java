package lab8;
import java.util.Scanner;
class Node{
	int data;
	Node prev,next;
}
class DLinkedList{
	Node head;
	public void insert(int x) {
		Node node=new Node();
		node.data=x;
		node.prev=node.next=null;
		Node temp;
		if(head==null) {
			head=node;
		}
		else if(x<=head.data) {
			node.next=head;
			node.next.prev=node;
			head=node;
		}
		else {
			temp=head;
			while(temp.next!=null && temp.next.data<x) {
				temp=temp.next;
			}
			node.next=temp.next;
			if(temp.next!=null) {
				node.next.prev=node;
			}
			temp.next=node;
			node.prev=temp;
		}		
	}
	public void delete(int x) {
		Node temp=head;
		while(temp!=null) {
			if(x==temp.data && temp!=head) {
				temp.prev.next=temp.next;
			}
			else if(x==temp.data && temp==head){
				head=temp.next;
				head.prev=null;
			}
			temp=temp.next;
		}
	}	
	public void print() {
		Node temp=head;
		System.out.println("Previous Address\t"+"Node\t"+"Current Address\t\t"+"Next Address");
		System.out.println("--------------------------------------------------------------------------");
		while(temp!=null) {
			if(temp==head) {
				System.out.print(temp.prev+"\t\t\t"+temp.data+"\t"+temp+"\t"+temp.next);
			}
			else {
				System.out.print(temp.prev+"\t"+temp.data+"\t"+temp+"\t"+temp.next);	
			}
			System.out.println();
			temp=temp.next;
		}
		System.out.println("--------------------------------------------------------------------------");
	}
}
public class q1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DLinkedList l=new DLinkedList();
		int ans=0;
		while(ans!=4) {
			System.out.print("Choose an option >\n1.Printing\n2.Insertion\n3.Deletion\n4.Exit > ");
			ans=in.nextInt();
			switch (ans){
			case 1:
				l.print();
				break;
			case 2:
				System.out.print("How many elements do you want to insert? ");
				int a=in.nextInt();
				for(int i=0;i<a;i++) {
					System.out.print("Enter the data "+(i+1)+" : ");
					int x=in.nextInt();
					l.insert(x);
				}
				break;
			case 3:
				System.out.println("Enter the data you want to delete : ");
				int x=in.nextInt();
				l.delete(x);
				break;
			case 4:
				System.out.println("Program Terminated!");
				break;
			}
		}
		in.close();
	}
}
