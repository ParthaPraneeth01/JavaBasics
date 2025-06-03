import java.util.*;

public class factFor{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int total=1;
		for(int i=num;i>1;i--){
			total*=i;
		}
		System.out.println(total);
	}
}
