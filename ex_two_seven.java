package array;

public class ex_two_seven {

	public static void main(String[] args) {
		int[]arr= {1,8,2,3,9,4,5,5,6,45,9,9,54,54,87,3,4,8,5};
		System.out.print("Array:{");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int k=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					k++;
				}
			}
			if(k>0) {
				System.out.println(arr[i]+" is repeated "+(k+1)+" times");
			}
		}
	}

}
