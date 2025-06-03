import java.util.*;
public class postFixUsingStacks{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("NOTE:: ENTER A VALID QUESTION:");
		Stack<Integer> s=new Stack<>();
		String st=sc.nextLine();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isDigit(ch))
			{
			    int num=ch-'0';
				s.push(num);
			}
			else
			{
				int a=s.pop();
				int b=s.pop();
				switch(ch){
					case '+':
						s.push(a+b);
						break;
					case '-':
						s.push(a-b);
						break;
					case '*':
						s.push(a*b);
						break;
					case '/':
						s.push(a/b);
						break;
					default:
						System.out.println("Enter a valid operation");
						System.exit(0);
				}
			}
			
		}
		System.out.println(s.pop());
	 }
}
