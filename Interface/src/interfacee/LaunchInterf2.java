package interfacee;

interface Calc2
{
	void mul();
	void div();
}

abstract class MCalc implements Calc2
{
	//public abstract void mul() implemented down
	//public abstract void div()
	@Override
	public void mul()
	{
		System.out.println("Multiplication");
	}
	
}


public class LaunchInterf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}