package sStatic;
class Demo{
	static int a,b;
    int x,y;
    static {
    	a=20;
    	b=40;
    	System.out.println("static initialization block");
    	
    }
    //java initialization block
    {
    	x=100;
    	y=200;
    	System.out.println("java non ststic initialization block");
    	
    }
    Demo(){
    	System.out.println("cONSTRUCTOR BLOCK");
    	
    }
    static void disp1() {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println("ststic disp method");
    }
    void disp2() {
    	a=10;
    	b=20;
   
    	System.out.println("nonststic disp[ method");
     	System.out.println(x);
     	System.out.println(y);
    }
}
public class Sstaaticexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Demo d=new Demo();
d.disp2();
Demo.disp1();
 
	}

}
