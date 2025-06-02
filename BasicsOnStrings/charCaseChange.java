import java.util.*;
public class charCaseChange
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		String b="";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isUpperCase(ch)){
				b+=(String.valueOf(ch)).toLowerCase();
			}
			else{
				b+=String.valueOf(ch).toUpperCase();
			}
			
		}
		System.out.println(b);
	}
}