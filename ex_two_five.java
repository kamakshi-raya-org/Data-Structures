package array;

public class ex_two_five {

	public static void main(String[] args) {
		int[]arr={1,2,3,4,5,6,45,7};
		System.out.print("Original Array:{");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
		System.out.println();
		int[]n_arr=new int[arr.length+1];
		int x=8,index=6;
		for(int i=0;i<index;i++) {
			n_arr[i]=arr[i];
		}
		n_arr[index]=x;
		for(int i=index+1;i<n_arr.length;i++) {
			n_arr[i]=arr[i-1];
		}
		System.out.print("New Array:{");
		for(int i=0;i<n_arr.length;i++) {
			System.out.print(n_arr[i]+",");
		}
		System.out.print("}");
	}

}
