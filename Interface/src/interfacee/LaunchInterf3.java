package interfacee;

interface Calculator1
{
	void add(int num1, int num2);
	void sub(int num1, int num2);
	void disp();
}

interface Calculator2
{
	void mul(int num1, int num2);
	void div(int num1, int num2);
	void disp();
}
interface Many
{
	float pi=3.14f;// public static final float pi=3.14f;
}


class MyCalculator1 implements Calculator1, Calculator2, Many
{
	
	public void add(int num1, int num2) 
	{

		int res=num1+num2;
		System.out.println("Add : "+res);
		//pi=4.5f;
		System.out.println(pi);
		
	}

	
	public void sub(int num1, int num2)
	{
		int res=num1-num2;
		System.out.println("Sub : "+res);
		
	}


	
	public void mul(int num1, int num2) 
	{
		int res=num1*num2;
		System.out.println("Mul : "+res);
		
	}


	
	public void div(int num1, int num2) 
	{
		int res=num1/num2;
		System.out.println("Div : "+res);
		
	}



	public void disp() 
	{
		
		System.out.println("common implementation for disp()");
	}
}

public class LaunchInterf3 
{

	public static void main(String[] args) 
	{
		MyCalculator1 cal=new MyCalculator1();
		cal.add(10, 5);
		cal.sub(10, 5);
		cal.mul(10, 5);
		cal.div(10, 5);
		cal.disp();

	}

}