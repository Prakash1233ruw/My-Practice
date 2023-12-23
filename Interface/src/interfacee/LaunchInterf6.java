package interfacee;

interface Beta2
{
	//all methods public and abstract
	// from java 8 interface can have method with implementation
	
	default void disp()
	{
		System.out.println("implemented method disp of an interface");
	}
	default void beta()
	{
		System.out.println("implemented method beta of an Beta interface");
	}
	
	static void showing()
	{
		System.out.println("Statuc method of an interface after java 8 ");
	}
}

interface Alp
{
	default void beta()
	{
		System.out.println("implemented method beta of an Alp interface");
	}
}


class AlphaBeta implements Beta2 //, Alp
{
	void show()
	{
		
	}
	public void disp()
	{
		System.out.println("I m overrdding by my choice not mandatory");
	}
}
public class LaunchInterf6 
{

	public static void main(String[] args) 
	{
		AlphaBeta ab=new AlphaBeta();
	ab.disp();
	
	Beta2.showing();
	

	}

}