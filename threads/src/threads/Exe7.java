package threads;
class CarShare implements Runnable{

	
	 public void run() {
		try {
		System.out.println(Thread.currentThread().getName()+"has entered thr parking lot");
	
			Thread.sleep(4000);
			synchronized(this) {
			System.out.println(Thread.currentThread().getName()+"has got in to car");
			Thread.sleep(4000);
			
			System.out.println(Thread.currentThread().getName()+"started th ecar");
			Thread.sleep(4000);
			
			System.out.println(Thread.currentThread().getName()+"come back and turned into supercar");
			Thread.sleep(4000);
			
			System.out.println(Thread.currentThread().getName()+"came out of car");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class Exe7 {

	public static void main(String[] args) {
		CarShare cs=new CarShare();
		Thread t1=new Thread(cs);
		Thread t2=new Thread(cs);
		Thread t3=new Thread(cs);
		t1.setName("CHILD1");
		t2.setName("CHILD2");
		t3.setName("CHILD3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
