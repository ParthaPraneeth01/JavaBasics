import java.util.*;

public class lcm{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a!=0 && b!=0){
			if(a>=b){
				a=a%b;
			}
			else{
				b=b%a;
			}
		}
		int gcd=a==0?b:a;
		double abs=Math.abs(n1*n2);
		System.out.println(abs/gcd);
	}
}