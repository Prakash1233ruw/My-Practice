package interfacee;

interface Shapes1
{
	void input();
	void compute();
	void disp();
	void show();
}

interface Alpha1
{
	//tagged //Marker
}

class Shaping implements Alpha1
{
	public void show()
	{
		System.out.println("Show method of shaping class");
	}
}

class Rectangle12 extends Shaping implements Shapes1
{

	
	public void input() 
	{
		
		
	}

	@Override
	public void compute() 
	{
		
		
	}

	@Override
	public void disp() 
	{
		
		
	}
	
}


class Raghavender
{
	void bahave()
	{
		System.out.println("He is focused and curious Java learner");
	}
//	void disp()
//	{
//		
//	}
}


public class LaunchInterf5 
{

	public static void main(String[] args) 
	{
		//Raghavender r;
		
		new Raghavender().bahave();
//		Raghavender r=new Raghavender();
//				r.disp();

	}

}