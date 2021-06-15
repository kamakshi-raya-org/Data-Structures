package array;

import java.util.Scanner; 
public class ex_two_four {
 
public static void main(String[] args) {
	int[]arr={1,2,3,4,5,6,45,7};
	System.out.print("Original Array:{");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.print("}");
	System.out.println();
	int[]new_arr=new int[arr.length-1];
	int x=5,j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			j=i-1;
			break;
		}
	}
	for(int i=0;i<=j;i++) {
		new_arr[i]=arr[i];
	}
	for(int i=j+1;i<new_arr.length;i++) {
		new_arr[i]=arr[i+1];
	}
	System.out.print("New Array:{");
	for(int i=0;i<new_arr.length;i++) {
		System.out.print(new_arr[i]+",");
	}
	System.out.print("}");
 }
}
