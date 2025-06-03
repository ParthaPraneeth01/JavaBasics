import java.util.*;

public class indexFindInArray{
	 public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Enter element need to search::");
		int srch=sc.nextInt();
		for(int i=1;i<num;i++){
			if(srch==arr[i]){
				System.out.println("Found at index "+i);
				System.exit(0);
			}
		}
		System.out.println("Not Found");
	}
}