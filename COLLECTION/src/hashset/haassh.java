package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class haassh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet hs=new HashSet();
     hs.add("java");
     hs.add(20);
     hs.add(30);
     hs.add(50);
     hs.add(78);
     hs.add(34);
     System.out.println(hs);
     System.out.println(hs.contains(50));
     System.out.println("**********************");
    LinkedHashSet hs2=new LinkedHashSet();
     hs2.add("java");
     hs2.add(20);
     hs2.add(30);
     hs2.add(50);
     hs2.add(78);
     hs2.add(34);
     System.out.println(hs2);
     System.out.println(hs2.contains(50));
	}

}
