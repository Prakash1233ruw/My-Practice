package threads;

import java.util.Scanner;
class Alpha2 extends Thread{
	public void run() {
		System.out.println("banking activity started....");
		Scanner sc=new Scanner(System.in);
		System.out.println("pealse entre thr acc number");
		int accNo=sc.nextInt();
		System.out.println("pealse entre thr apwd number");
		int passNo=sc.nextInt();
		System.out.println("login success");
		
		System.out.println("banking activity ended....");
	}
}
class Beta2 extends Thread{
	public void run() {
		System.out.println("***********************************");
		System.out.println("printing  activity started....");
		for(int i=0;i<5;i++) {
			System.out.println("the new generatefd number is "+i);
		}
		System.out.println("printing activity ended....");
		System.out.println("***********************************");
	}
}
class Gamma2 extends Thread{
	public void run()  {
		System.out.println("display imp messg activity started....");
		for(int i=0;i<4;i++) {
			System.out.println("fpcus is the key");
		
		}
		System.out.println("banking activity started....");
		
	}
}
public class Exe2 {

	public static void main(String[] args) throws InterruptedException {
	Alpha2 a=new Alpha2();
	Beta2 b=new Beta2();
	Gamma2 g=new Gamma2();
	a.start();
	b.start();
	g.start();
	}
}
