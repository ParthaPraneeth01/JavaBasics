import java.util.*;
public class sameOccurenceCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		char scrh=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch==scrh){
				count+=1;
			}
			
		}
			System.out.println(count);
	}
}