package sStatic;

class Demo2
{
	int a, b;
	
	
	static long age;
	
	
	{
		
		age++;
	}
	
	Demo2()
	{
		
//		{
//			
//			count++;  
//		}
		System.out.println("Constructor1");
		
	}
	
	Demo2(int a)
	{
		
//		{
//		
//		count++;  
//	}
		this.a=a;
		System.out.println("Constructor2");
		
	}
	
	Demo2(int a, int b)
	{
		
//		{
//		
//		count++;  
//	}
		this.a=a;
		this.b=b;
		System.out.println("Constructor3");
		
	}
	Demo2(int a, int b,int c)
	{
		
//		{
//		
//		count++;  
//	}
		this.a=a;
		this.b=b;
		System.out.println("Constructor4");
		
	}
	
}


public class sttic3 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Demo2.age);//0
		Demo2 d1=new Demo2();
		System.out.println(d1.age);//1
		
		Demo2 d2=new Demo2(10);
		System.out.println(d2.age);//2
		
		Demo2 d3=new Demo2(10, 20);//3
		System.out.println(d3.age);
		
		Demo2 d4=new Demo2(10, 20);//3
		System.out.println(d4.age);
		
		

	}

}
