package array;

public class ex_two_six {

	public static void main(String[] args) {
		 int[]arr={1,2,3,4,5,5,6,45,7};
		 System.out.print("Array:{");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
			}
			System.out.print("}");
			System.out.println();
		 int min=arr[1],max=arr[1];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("Minimum value is "+min);
		 System.out.println("Maximum value is "+max);
	}

}
