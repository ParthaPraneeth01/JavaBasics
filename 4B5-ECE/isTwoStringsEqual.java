import java.util.*;
public class isTwoStringsEqual
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		String st1=sc.nextLine();
		
		if(st.length()!=st1.length()){
			System.out.println("Not Equal");
			System.exit(0);
		}
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			char ch1=st1.charAt(i);
			
			if(ch!=ch1){
				System.out.println("Not Equal");
				System.exit(0);
			}
			
		}
		
		System.out.println("Equal");
	}
}