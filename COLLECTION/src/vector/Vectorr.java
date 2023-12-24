package vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		Vector v=new Vector();
       v.add(100);
       v.add(200);
       v.add(300);
       v.add(400);
       System.out.println(v);
      Enumeration elem= v.elements();
      while(elem.hasMoreElements()) {
    	  System.out.println(elem.nextElement());
      }
	}

}
