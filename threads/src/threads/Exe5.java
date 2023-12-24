package threads;

import java.util.Scanner;

class Calc extends Thread{

	@Override
	public void run() {
		System.out.println("calculation is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1 ");
		int n1=sc.nextInt();
		System.out.println("enter number 2");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println(sum);
		System.out.println("Calulation is completed");
		
	}
	
}
class Message extends Thread{

	@Override
	public void run() {
	System.out.println("displaying imp msg");
		for(int i=0;i<4;i++) {
			System.out.println("never ever give up");
		}
		System.out.println("message ended");
	}
	
}
public class Exe5 {

	public static void main(String[] args) throws InterruptedException {
	System.out.println(" main thread started");
  Calc c=new Calc();
  Message m=new Message();
  System.out.println(c.isAlive());
  System.out.println(m.isAlive());
//  c.run();
//  m.run();
  c.start();
  m.start();
  
//  Thread t1=new Thread(c);
//  Thread t2=new Thread(m);
  System.out.println(c.isAlive());
  System.out.println(m.isAlive());
  c.join();
  m.join();
//  t1.start();
//  
//  t2.start();
	System.out.println(" main thread ended");
	}

}
