package collectionn.Class;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

class Employe implements Comparable<Employe>{
	int id;
	String name;
	int age;
	public Employe(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employe o) {
		if (this.age>o.age)
		return 1;
		else
			return -1;
	}
	
}
public class P {

	public static void main(String[] args) {
		  Employe emp1=new Employe(2,"kakashi",24);
		  Employe emp2=new Employe(6,"madara",114);
		  Employe emp3=new Employe(3,"naruto",15);
		  List <Employe>list=new ArrayList<>();
		  list.add(emp1);
		  list.add(emp2);
		  list.add(emp3);
		  System.out.println(list);
//		  Collections.sort(list, (Employe ob1,Employe ob2)->{
//			  if(ob1.age>ob2.age)
//				  return 1;
//			  else
//				  return -1;
//		  });
		  Collections.sort(list);
		  System.out.println(list); 
	}

}
