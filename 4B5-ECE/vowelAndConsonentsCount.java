import java.util.*;
public class vowelAndConsonentsCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		int vo=0;
		int con=0;
		st=st.toLowerCase();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				vo+=1;
			}
			else if (ch >= 'a' && ch <= 'z') {
                con++;
            }
			
		}
		System.out.println("vowels:"+vo);
		System.out.println("consonents:"+con);
	}
}