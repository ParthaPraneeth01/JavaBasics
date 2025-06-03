import java.util.*;

class Queue{
	int [] arr=new int[3];
	int rear=-1;
	int front=-1
	void push(int i)
	{
		if(front==arr.length-1)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			front++;
			arr[front]=i;
		}
	}
	void pop()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			rear--;
			System.out.println("The deleted element is:"+arr[rear+1]);
		}
	}
	void peekElement()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println(arr[front]);
		}
	}
	void display()
	{
		System.out.println("The Elements are:");
		for(int j=0;j<=front;j++){
			System.out.println(arr[j]);
		}
		
	}
	void clear()
	{
		front=-1;
	}
}

public class queueImplementation{
	 public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		Queue s=new Queue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.push(4);
		s.clear();
		s.pop();
	 }
}