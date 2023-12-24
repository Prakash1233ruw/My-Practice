package collectionn.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollClass {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(20);
	list.add(30);
	list.add(22);
	list.add(12);
	list.add(12);
	System.out.println("unorderd list :"+list);
	Collections.sort(list);
	System.out.println("orderd list :"+list);
	
	Collections.rotate(list, 3);
	System.out.println(list);
	
	Collections.rotate(list, -1);
	System.out.println(list);
	
	Collections.shuffle(list);
	System.out.println(list);
	
	System.out.println(Collections.frequency(list,22));
}
}
