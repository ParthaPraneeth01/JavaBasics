import java.util.*;

public class reverseArray{
	 public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Reversed Array is:");
		int a=0,z=arr.length-1;
		while(a<z){
			int temp=arr[a];
			arr[a]=arr[z];
			arr[z]=temp;
			a++;
			z--;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	 }
}
