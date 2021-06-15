package lab6;
class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void move() {
		Node n=head,prev=null,e;
		while(n.next!=null) {
			prev=n;
			n=n.next;		
		}
		e=n;
		prev.next=null;
		e.next=head;
		head=e;
	}
	public void printlist() {
		Node node=head;
		System.out.print("Linked List : ");
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.print("null");
	}
	public void remove(int n,LinkedList e) {
		if(e.head ==null){
			return;
			}
		if(e.head.data==n){ 
			e.head=e.head.next;
			}
		Node p=e.head,c=e.head.next;
		while(c!=null) {
			if(c.data==n) {
				p.next=c.next;
			}
			p=p.next;
			c=c.next;
			
		}
	}
	public LinkedList join(LinkedList A,LinkedList B) {
		LinkedList l=new LinkedList();
		Node a=A.head;
		while(a!=null) {
			l.insert(a.data);
			a=a.next;
		}
		a=B.head;
		while(a!=null) {
			l.insert(a.data);
			a=a.next;
		}
		return l;
	}
	public int length(LinkedList l) {
		Node n=l.head;
		int c=0;
		while(n!=null) {
			c++;
			n=n.next;
		}
		return c;
	}
	public void unduplicate(LinkedList l) {
		Node a=l.head,b,c;
		while(a!=null && a.next!=null) {
			b=a;
			while(b.next!=null) {
				if(a.data==b.next.data) {
					c=b.next;
					b.next=b.next.next;
				}
				else {
					b=b.next;
				}
			}
			a=a.next;
		}	
	}
	public LinkedList intersection(LinkedList A,LinkedList B) {
		LinkedList u=join(A,B);
		unduplicate(u);
		Node n=u.head,a=A.head,b=B.head;
		int x,y,w=0,v=length(u);
		int[]r=new int[v];
		while(n!=null) {
			x=0;
			y=0;
			a=A.head;
			b=B.head;
			while(a!=null) {
				if(n.data==a.data) {
					x+=1;
				}
				a=a.next;
			}
			while(b!=null) {
				if(b.data==n.data) {
					y+=1;
				}
				b=b.next;
			}
			if(x==0 || y==0) {
				r[w]=n.data;
				w+=1;
			}
			n=n.next;
		}
		for(int i=0;i<r.length;i++) {
			if(r[i]!=0) {
				remove(r[i], u);
			}
		}
		return u;
	}
	public void identical(LinkedList A,LinkedList B) {
		Node a=A.head,b=B.head;
		int sum=0;
		if(length(A)==length(B)) {
			while(a!=null) {
				if(a.data==b.data) {
					sum++;
				}
				a=a.next;
				b=b.next;
			}
			if(sum==length(A)) {
				System.out.println("The lists are identical");
			}
			else {
				System.out.println("The lists are not identical");
			}
		}
		else {
			System.out.println("The lists are not identical");
		}
	}
	public void removeleft(LinkedList l) {
		Node n=l.head,c;
		while(n.next!=null) {
			c=n.next;
			while(c!=null) {
				if(c.data>n.data) {
					remove(n.data,l);
				}
				c=c.next;
			}
			n=n.next;
		}
	}
}
