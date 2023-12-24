package threads;
class Control implements Runnable{
	
	@Override
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")) {
			Typing();
		}else if(tName.equals("Check")) {
			SpellCheck();
		}else {
			AutoSave();
		}
		
	}
public void  Typing(){
	for(int i=0;i<4;i++) {
		System.out.println("typing ......");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public void SpellCheck(){
	for(int i=0;i<4;i++) {
		System.out.println("spellchecking ......");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public void AutoSave() {
	for(int i=0;i<4;i++) {
		System.out.println("Autosaving ......");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Control one=new Control();
 Thread t1=new Thread(one);
 Thread t2=new Thread(one);
 Thread t3=new Thread(one);
 t1.setName("Type");
 t2.setName("Check");
 t3.setName("save");
 t3.setDaemon(true);
 t1.setDaemon(true);
// t2.setPriority(5);
// t3.setPriority(4);
 t1.start();
 t2.start();
 t3.start();
 
	}

}
