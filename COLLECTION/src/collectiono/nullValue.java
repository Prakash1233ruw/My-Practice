package collectiono;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class nullValue {

	public static void main(String[] args) {
		
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(10);
//		al.add(null);
//		al.add(null);//[10, 10, null, null]
//		System.out.println(al);
		
//		List al=new LinkedList();
//		al.add(10);
//		al.add(10);
//		al.add(null);
//		al.add(null);
//  System.out.println(al);//[10, 10, null, null]
		
//		ArrayDeque al=new ArrayDeque();
//		al.add(10);
//		al.add(10);
////		al.add(null);//null pointer exception
//  System.out.println(al);//[10, 10] duplicates allowed
		
//		PriorityQueue al=new PriorityQueue();
//		al.add(10);
//		al.add(10);
//		
////		al.add(null);//null pointer exception
//  System.out.println(al);//[10, 10] duplicates allowed
  
  
//TreeSet al=new TreeSet();
//	al.add(10);
//	al.add(10);
////	al.add(null);//[10]null pointer exception
//System.out.println(al);
  
//HashSet al=new HashSet();
//al.add(10);
//al.add(null);
//al.add(null);
//System.out.println(al);//[null, 10]
		
		LinkedHashSet al=new LinkedHashSet();
		al.add(10);
		al.add(null);
		al.add(null);
		System.out.println(al);
	}

}
