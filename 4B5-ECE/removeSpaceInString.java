import java.util.*;
public class removeSpaceInString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		String b="";
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		if(Character.isLetter(ch)){
			b+=ch;
		}
		
	}
		System.out.println(b);
	}
}