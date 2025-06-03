import java.util.*;
public class reverseUsingStack{
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Stack<Character> s=new Stack<>();
		String st=sc.nextLine();
		String rev="";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			s.push(ch);
		}
		for(int i=0;i<st.length();i++)
		{
			rev+=s.pop();
		}
		System.out.println(rev);
	 }
}
