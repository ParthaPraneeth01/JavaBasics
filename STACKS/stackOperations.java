import java.util.*;
public class stackOperations{
	 public static void main(String[] args){
	
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.size());
		s.clear();
		System.out.println(s.empty());
		System.out.println(s.size());
	 }
}