package Collection;
import java.util.*;
import java.util.List;



public class AL 
{

	public static void main(String[] args) {
	ArrayList b=new ArrayList();
	b.add(13);
	b.add(8);
	b.add(6);

	System.out.println(b);
	ArrayList b1=new ArrayList();
	b1.add(3);
	b1.add("hello");
	b1.add('f');
	System.out.println(b1);
	List b3=new ArrayList();
	b3.addAll(b1);
	
	b3.add("b1+this msg");
	System.out.println(b3);
	b3.add(2,"focus");
	System.out.println(b3);
	b3.add(34);
	
	System.out.println(b3);
	b3.addAll(6,b);
	
	System.out.println(b3);
	System.out.println(b3.get(3));
	
	System.out.println(b3.isEmpty());
}
}