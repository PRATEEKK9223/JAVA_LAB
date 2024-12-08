package lab_2;

import lab_3.employee;

public class STACK_OPERATION {
	int top,size;
	int[] stack;
	
	STACK_OPERATION(int size)
	{
		this.top=-1;
		this.size=size;
		this.stack=new int[size];
	}
	
	public void push(int ele)
	{
		if(top==size-1)
			System.out.println("full");
		else {
			stack[++top]=ele;
			System.out.println("pushed elements is "+ele);
		}
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("full");
		else {
			System.out.println("poped element is" + stack[top--]);
			
		}
	}
	
	public void peek()
	{
		if(top==-1)
			System.out.println("empty");
		else {
			System.out.println("top element is "+stack[top]);
		}
	}
	
	void display()
	{
		if(top==-1)
			System.out.println("empty");
		else {
			System.out.println("stack element are");
			for(int i=top;i>=0;i++)
				System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		
		STACK_OPERATION obj =new STACK_OPERATION(10);
		obj.push(12);
		obj.push(13);
		obj.pop();
		obj.peek();
		
		

	}

}
