package Collection;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList list=new LinkedList();
  list.add(60);
  list.add(20);
  list.add(40);
  System.out.println(list);
  list.addFirst(100);
  System.out.println(list);
  System.out.println("****************************************");
  LinkedList list2=new LinkedList();
  list2.add(10);
  list2.add('j');
  list2.add("java");
  list2.add(44.8);
  System.out.println(list2);
  System.out.println(list2.contains("java"));
  System.out.println(list2.getFirst());
  System.out.println(list2.getLast());
  System.out.println(list2.peekFirst());
  System.out.println(list2);
  System.out.println("**********************************************8");
  System.out.println(list2.pollFirst());
  System.out.println(list2);
  list2.offer(124);
  System.out.println(list2);
  list2.offerFirst(44);
  System.out.println(list2);
  list2.push(200);
  System.out.println(list2);
  list2.addFirst(777);
  System.out.println(list2);
  System.out.println(list2.pop());
  System.out.println(list2);

}
}
