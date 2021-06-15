package array;

public class ex_two_one {
	 static int sum(int[]arr) {
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		 }
		 return sum;
	 }
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,5,6,45,7};
		System.out.println(sum(a));
	}

}
