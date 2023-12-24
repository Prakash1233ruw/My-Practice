package threads;
class Library implements Runnable{
  String res1 =new String("java");
  String res2 =new String("DSA");
  String res3 =new String("Spring");
	@Override
	public void run() {//dead lock example
		String tName=Thread.currentThread().getName();
		if("student1".equals(tName)) {
			try {
				Thread.sleep(4000);
				synchronized(res1) {
					System.out.println("student 1 has acquired res1 : "+res1);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("student 1 has acquired res2 : "+res2);
						Thread.sleep(4000);
						synchronized(res3) {
							System.out.println("student 1 has acquired res3 : "+res3);
							Thread.sleep(5000);
						}
					}
				}
			}catch(Exception e) {
				System.out.println("some problem");
			}
			
		}
		else {
			try {
				Thread.sleep(4000);
				synchronized(res3) {
					System.out.println("student 2 has acquired res3 : "+res3);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("student 2 has acquired res2 : "+res2);
						Thread.sleep(4000);
						synchronized(res1) {
							System.out.println("student 2 has acquired res1 : "+res1);
							Thread.sleep(5000);
						}
					}
				}
			}catch(Exception e) {
				System.out.println("some problem");
			}
		}
	}
	
}
public class Exe8 {

	public static void main(String[] args) {
		
Library lib=new Library();
Thread t1=new Thread(lib);
Thread t2=new Thread(lib);
t1.setName("student1");
t2.setName("student2");
t1.start();
t2.start();
	}

}
