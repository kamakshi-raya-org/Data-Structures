package lab8;
class pnode{
	int exp,coeff;
	pnode next;
}
class LL{
	pnode head;
	public void insert(int coeff,int exp) {
		pnode node=new pnode();
		node.coeff=coeff;
		node.exp=exp;
		pnode prev=null;
		pnode temp=head;
		while(temp!=null && exp<temp.exp) {
			prev=temp;
			temp=temp.next;
		}
		if(prev==null) {
			head=node;
		}
		else {
			prev.next=node;
		}
		node.next=temp;
	}
	public void in(int coeff,int exp) {
		pnode node=new pnode();
		node.coeff=coeff;
		node.exp=exp;
	}
	public void delete(int x) {
		if(head ==null){
			return;
			}
		if(head.exp==x){ 
			head=head.next;
			}
		pnode p=head,c=head.next;
		while(c!=null) {
			if(c.exp==x) {
				p.next=c.next;
			}
			p=p.next;
			c=c.next;
		}
	}	
	public void print() {
		pnode temp=head;
		while(temp.next!=null) {
			System.out.print(temp.coeff+"x^"+temp.exp+"+");
			temp=temp.next;
		}
		System.out.println(temp.coeff+"x^"+temp.exp);
	}
}
public class q3 {
	public static LL mult(LL p1,LL p2) {
		LL p=new LL();
		pnode temp1=p1.head,temp2;
		int c,e;
		while(temp1!=null) {
			temp2=p2.head;
			while(temp2!=null) {			
				c=temp1.coeff*temp2.coeff;
				e=temp1.exp+temp2.exp;
				p.insert(c,e);
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
		temp1=p.head;
		while(temp1!=null) {
			temp2=temp1.next;
			while(temp2!=null) {
				if(temp1.exp==temp2.exp) {
					c=temp1.coeff+temp2.coeff;
					e=temp2.exp;
					p.delete(e);
					p.delete(e);
					p.insert(c,e);
				}
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
		return p;
	}
	public static void main(String[]args) {
		LL p1=new LL();
		LL p2=new LL();
		p1.insert(3,2);
		p1.insert(5,1);
		p1.insert(6,0);
		p2.insert(6,1);
		p2.insert(8,0);
		System.out.print("Polynomial p1 : ");
		p1.print();
		System.out.print("Polynomial p2 : ");
		p2.print();
		System.out.print("Polynomial p1xp2 : ");
		mult(p1,p2).print();;
	}
}
