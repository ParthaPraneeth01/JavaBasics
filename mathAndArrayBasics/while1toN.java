import java.util.*;

public class while1toN{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int num=1;
		while(num!=N+1){
			System.out.println(num);
			num++;
		}
	}
}