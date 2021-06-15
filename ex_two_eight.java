package array;

public class ex_two_eight {

	public static void main(String[] args) {
		int[]arr={1,2,3,-1,-14,0,5,6,45,7};
		int k=0,j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				k++;
			}
			else if(arr[i]==-1) {
				j++;
			}
		}
		if(k>0 && j>0) {
			System.out.println("Array contains 0 and -1");
		}
		else {
			System.out.println("Array doesnt contain 0 and -1");
		}
	}

}
