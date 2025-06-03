import java.util.*;

class Stack{
	int [] arr=new int[3];
	int top=-1;
	void push(int i)
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			arr[top]=i;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			top--;
			System.out.println("The deleted element is:"+arr[top+1]);
		}
	}
	void peekElement()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(arr[top]);
		}
	}
	void display()
	{
		System.out.println("The Elements are:");
		for(int j=0;j<=top;j++){
			System.out.println(arr[j]);
		}
		
	}
	void clear()
	{
		top=-1;
	}
}

public class stackImplementation{
	 public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.push(4);
		s.clear();
		s.pop();
	 }
}