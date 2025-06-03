import java.util.*;

public class Prime2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<n;i++){
			if(num%i==0){
				System.out.println("Not a Prime");
				System.exit(0);
			}
		}
		System.out.println("Prime");
		
	}
}