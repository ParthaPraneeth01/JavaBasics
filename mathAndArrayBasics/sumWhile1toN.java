import java.util.*;

public class sumWhile1toN{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int num=1;
		int sum=0;
		while(num!=N+1){
			sum+=num;
			num++;
		}
		System.out.println(sum);
	}
}