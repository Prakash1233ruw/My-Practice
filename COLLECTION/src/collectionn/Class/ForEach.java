package collectionn.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(56);
		list.add(33);
		
//		System.out.println(list);

		 List<Integer> list2 =Arrays.asList(23,12,56,33);
//		 System.out.println(list);
		 
//		 for(Integer o:list2) {
//			 System.out.println(o);
//		 }
//		 Consumer<Integer> cons= i->System.out.println(i);
		 
	list2.forEach(i->System.out.println(i));	 
		 
	}

}
