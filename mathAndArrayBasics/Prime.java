import java.util.*;

public class Prime{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i*i<=num;i++){
			if(num%i==0){
				count+=1;
				if(i!=num/i){
					count+=1;
				}
			}
		}
		if(count==2){
			System.out.println(num +"is a prime");
		}
	}
}
