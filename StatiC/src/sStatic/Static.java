package sStatic;



public class Static {
	static int a;
	static {
		a=10;
		System.out.println(a);
		System.out.println("static blok");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
}
