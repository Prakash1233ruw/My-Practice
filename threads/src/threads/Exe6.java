package threads;

import java.util.Scanner;

class  Alian implements Runnable{
	@Override
	public void run() {
		
		String tName=Thread.currentThread().getName();
	System.out.println(	Thread.currentThread().getPriority());
		if(tName.equals("Calc")){
			calc();
		}else {
			message();
		}
	}
	public void calc() {
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
	public void message() {
		System.out.println("displaying imp msg");
		for(int i=0;i<4;i++) {
			System.out.println("never ever give up");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("message ended");
	}
	
	
}
public class Exe6 {

	public static void main(String[] args) {
		 
  Alian al=new Alian();
  Thread t1=new Thread(al);
  Thread t2= new Thread(al);
  t1.setName("Calc");
  t2.setName("Msg");
  t1.start();
  t2.start();
	}

}
