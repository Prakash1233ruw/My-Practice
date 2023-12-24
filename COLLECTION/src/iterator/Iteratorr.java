package iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorr{
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(30);
	list.add(88);
	list.add(21);
	list.add(67);
	
	Iterator itr=list.iterator();

//	boolean status=itr.hasNext();
//	if(status) {
//		System.out.println(itr.next());
//	}
	
	while(itr.hasNext()) {
//		Object obj=itr.next();
//		System.out.println(obj);
		System.out.println(itr.next());
	}
	System.out.println("********************");
	
	ListIterator litr=list.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next()+"y");
	}
	System.out.println("********************");
	ListIterator litr2=list.listIterator(list.size());
	while(litr2.hasPrevious()) {
		System.out.println(litr2.previous());
	}
	System.out.println("********************");
	ArrayDeque ad=new ArrayDeque();
	ad.add(20);
	ad.add(77);
	ad.add(33);
	ArrayList list2=new ArrayList();
	list2.addAll(ad);
	ListIterator litr3=list2.listIterator(list2.size());
	while(litr3.hasPrevious()) {
		System.out.println(litr3.previous());
	}
	
}
}
