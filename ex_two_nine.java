package array;

public class ex_two_nine {
	static int a=0,b=1,c=0;
	   static void fib(int n) {
	      if (n>0) {
	         c=a+b;
	         a=b;
	         b=c;
	         System.out.print(","+c);
	         fib(n-1);
	      }
	   }
	 static int fac(int n) {
		 if (n>=1) {
	            return n*fac(n-1);
		 }
	        else {
	            return 1;
	        }
	 }
	   public static void main(String args[]) {
	      int n=10;
	      System.out.println("Fibonacci series for n=9 is:");
	      System.out.print(a+","+b);
	      fib(n-2);
	      System.out.println();
	      System.out.println(n+" factorial is "+fac(n));

	   }
}	
