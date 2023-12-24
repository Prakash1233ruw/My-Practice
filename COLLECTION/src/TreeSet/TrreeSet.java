package TreeSet;

import java.util.TreeSet;

public class TrreeSet {
public static void main(String[] args) {
	TreeSet set=new TreeSet();
	set.add(50);
	set.add(4);
	set.add(23);
	set.add(40);
	set.add(10);
	set.add(230);
	set.add(250);
	System.out.println(set);
	
	System.out.println(set.ceiling(200));
	System.out.println(set.higher(200));
	System.out.println(set.ceiling(230));
	System.out.println(set.higher(230));
	System.out.println(set.floor(50));
	System.out.println(set.lower(50));
	System.out.println(set.headSet(250));
	System.out.println(set.tailSet(50));
	System.out.println(set.ceiling(230));
	
	
}
}
