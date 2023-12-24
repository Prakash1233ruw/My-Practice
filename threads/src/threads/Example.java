package threads;

import java.util.Scanner;
class Alpha implements Runnable{
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
class Beta implements Runnable{
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
class Gamma implements Runnable{
	public void run()  {
		System.out.println("display imp messg activity started....");
		for(int i=0;i<4;i++) {
			System.out.println("fpcus is the key");
		
		}
		System.out.println("banking activity started....");
		
	}
}
public class Example {

	public static void main(String[] args) throws InterruptedException {
	Alpha a=new Alpha();
	Beta b=new Beta();
	Gamma g=new Gamma();
//	a.banking();
//	b.printNum();
//	g.printingMessage();
Thread thread1=new Thread(a);
Thread thread2=new Thread(b);
Thread thread3=new Thread(g);
thread1.start();
thread2.start();
thread3.start();
}
}
