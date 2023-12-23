package interfacee;

interface Calc1
{
	void add();//public abstract void add();
	public abstract void sub();
}

class MyCalc1 implements Calc1
{
	public void add()
	{
		int res=10+4;
		System.out.println("Implementted by first dev "+res);
	}
	public void sub()
	{
		int res=10-4;
		System.out.println("Implementted by first dev "+res);
		
	}
}

class MyCalc2 implements Calc1
{
	public void add()
	{
		int a=10;
		int b=6;
		int res=a+b;
		System.out.println("Implementted by 2nd dev "+res);
	}
	public void sub()
	{
		int a=10;
		int b=6;
		int res=a-b;
		System.out.println("Implementted by 2nd dev "+res);
		
	}
}
public class LaunchInter 
{

	public static void main(String[] args) 
	{

		MyCalc1 c1=new MyCalc1();
		c1.add();
		c1.sub();
		
		MyCalc2 c2=new MyCalc2();
		c2.add();
		c2.sub();

	}

}
