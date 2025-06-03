import java.util.*;

public class minnArray{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		int minn=arr[0];
		for(int i=1;i<num;i++){
			if(minn>arr[i]){
				minn=arr[i];
			}
		}
		System.out.println("Min No:"+minn);
	}
}