
import java.util.*;
public class Calculator {
	private int a=0,b=0;
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void div(int a, int b)
	{
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("exception occured, Division by zero exception");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner ip=new Scanner(System.in);
		int ch=0;
		Calculator c=new Calculator();
		while(ch<5)
		{
			System.out.println("enter your choice");
			System.out.println("1. Add, 2. Subract, 3. Multiply, 4. Divide, 5. Exit");
			ch=ip.nextInt();
			if(ch==0)
			{
				System.out.println("invalid input");
				continue;
			}
			if(ch==5)
			{
				break;
			}
			System.out.println("enter 2 numbers : ");
			a=ip.nextInt();
			b=ip.nextInt();
			c.setA(a);
			c.setB(b);
			switch(ch)
			{
			case 1: System.out.println(c.add(a, b)); break;
			case 2: System.out.println(c.sub(a, b)); break;
			case 3: System.out.println(c.mul(a, b)); break;
			case 4: c.div(a, b); break;
			
			default : System.out.println("Invalid input");
			}
			
			
		}
		
	}
	

}
