import java.util.*;
public class stringIsDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(!Character.isDigit(ch)){
				System.out.println("String is not Digits");
				System.exit(0);
			}
			
		}
		System.out.println("String is Digits");
	}
}