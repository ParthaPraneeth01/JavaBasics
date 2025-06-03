import java.util.*;

public class Array{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Even are:");
		for(int i=0;i<num;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}