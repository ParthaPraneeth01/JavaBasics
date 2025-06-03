import java.util.*;

public class Even{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int total=1;
		while(num>1){
			total*=num;
			num--;
		}
		System.out.println(total);
	}
}