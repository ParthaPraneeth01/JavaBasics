import java.util.*;
public class reverseString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		String b="";
	for(int i=st.length()-1;i>=0;i--)
	{
		b+=st.charAt(i);
		
	}
		System.out.println(b);
	}
}