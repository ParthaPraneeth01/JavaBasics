import java.util.*;

public class maxxArray{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++){
			if(arr[i]%2==0){
				evenCount+=1;
			}
			else{
				oddCount+=1;
			}
		}
		System.out.println("Even Count:"+evenCount);
		System.out.println("Odd Count:"+oddCount);
	}
}