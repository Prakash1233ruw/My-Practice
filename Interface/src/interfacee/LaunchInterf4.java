package interfacee;

interface Super
{
	void show();
}

interface Demo extends Super
{
	void disp();
}


//interface Super
//{
//	void show();
//}
//
//interface Demo implements Super
//{
//	void disp();
//}


class Demo44 implements Demo
{

	@Override
	public void show() 
	{
		
		
	}

	@Override
	public void disp() 
	{
		
		
	}
	public void java()
	{
		
	}
	
}

public class LaunchInterf4 
{
	public static void main(String[] args) 
	{
		
        // Super s=new Super();
		
		Super s=new Demo44();
		Demo d;
	}

}
