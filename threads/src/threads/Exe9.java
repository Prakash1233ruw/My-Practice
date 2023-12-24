package threads;

 class Producer extends Thread
{
	Queue q;
	public Producer(Queue q) {
		this.q=q;
	}
public void run() {
	int i=1;
	while(true) {
	
q.put(i++);
}
}

}

class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q) {
		this.q=q;
	}
	public void run() {
		while(true) {
			q.get();
		}
	}

}
class Queue{
	int i;
	boolean flag=false;
	synchronized public void put(int x) {
		try {
			if(flag==true) {
				wait();
			}
			else {
			
	        i=x;
	    	 System.out.println("i have produced the data in to x : "+x);
			flag=true;
			notify();
		}
	    }catch(Exception e) {
	    	System.out.println("some problem");
	    }
	}
	synchronized public void get() {
		try {
			if(flag==false)
			{
		wait();
        }else {
        	System.out.println("i have consumced the data in to x : "+i);
        	flag=false;
        	notify();
        }
		}
		catch(Exception e) {
		System.out.println("some problem");
	}
}
}


public class Exe9
{

	public static void main(String[] args) 
	{
		
		Queue q=new Queue();
		
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		
		p.start();
		c.start();
		
		

	}

}
