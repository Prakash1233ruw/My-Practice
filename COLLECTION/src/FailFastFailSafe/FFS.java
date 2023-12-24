package FailFastFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			list.add(44);
//		}
//		
		
//		Iterator itr =list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			list.add(33);//failfast
//		}//not allow concurrent modification 
		
		
		CopyOnWriteArrayList list3=new CopyOnWriteArrayList();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		
		Iterator itr =list3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list3.add(33);//failsafe  
		}//not allow concurrent modification  
	
	}

}
