package array;

public class ex_two_three {		
	
	public static void main(String[] args) {
		int k=0;
		int x=7;
		int[]arr={1,2,3,4,5,5,6,45,7};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println(x+" is at the index "+i);
				k+=1;
				break;
			}		
	}
		if(k!=1) {
				System.out.println(-1);
		}

	}
}
