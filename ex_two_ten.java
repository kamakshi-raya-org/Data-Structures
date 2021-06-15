package array;

public class ex_two_ten {
	public static void main(String[] args) {
		int n,count=0,b,c,sum=0;
        System.out.print("First 10 Armstrong numbers are: ");
        for(int i=1;i<=1000000000;i++){
            n=i;
            while(n>0){
                b=n%10;
                sum+=(b*b*b);
                n/=10;
            }
            if(sum==i) {
                System.out.print(i+",");
            }
            sum=0;
        }
	}

}
