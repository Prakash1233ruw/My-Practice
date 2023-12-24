package Access;

import java.util.ArrayList;

public class Accessingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList list=new ArrayList();
  list.add(20);
  list.add(34);
  list.add(44);
  list.add(66);
//  System.out.println(list);
  
//  list.get(0);
//  list.get(1);
//  list.get(2);
  
  for(int i=0;i<list.size();i++) {
	  System.out.print(list.get(i)+ " ");
  }
  System.out.println();
  for(int i=list.size()-1;i>=0;i--) {
	  System.out.print(list.get(i)+ " ");
  }
  System.out.println();
  for(Object obj:list) {
	  System.out.println(obj);
  }
	}

}
