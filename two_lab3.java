package arrays3;
import java.util.Arrays;
import java.util.Scanner;
public class two {
	public static void main(String[] args) {
		int[][]arr={{1,5,13,29},{11,16,25,38},{45,49,52,57},{51,54,59,66}};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int p=0,q;
		int[]temp=new int[arr.length*arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[p]=arr[i][j];
				p++;
			}
		}
		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i]>temp[j]) {
					q=temp[i];
					temp[i]=temp[j];
					temp[j]=q;
				}
			}
		}
		q=0;
		int n=arr.length,m=0,l;
		for(int i=0;i<n;i++) {
			l=0;
			int a=l;
			int b=m;
			for(int j=0;j<i+1;j++) {
				arr[a][b]=temp[q];
				a+=1;
				b-=1;
				q++;
			}
			m+=1;
		}
		int x=0;
		int k=1;
		for(int i=1;i<arr.length;i++) {
			int a=k;
			int b=n-1;
			for(int j=arr.length-1;j>x;j--) {
				if(i!=arr.length-1) {
					arr[a][b]=temp[q];
					a+=1;
					b-=1;
					q++;
				}
				else if(i==arr.length-1) {
					arr[arr.length-1][arr.length-1]=temp[q];
					q++;
				}
			}
			x++;
			k+=1;
		}
		System.out.println("\nSorted Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the element you want to search:");
		int f=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==f) {
					System.out.println(true);
					break;
				}
			}
		}
		in.close();
	}
}


