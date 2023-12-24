package collectionn.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
	int age;
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee1 ref) {
		if(this.id>ref.id)
		return 1;
		else
			return -1;
	}
}
	

public class ComplexSorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee1 emp1=new Employee1(2,"kakashi",24);
//    System.out.println(emp1);
    
    Employee1 emp2=new Employee1(6,"madara",114);
//    System.out.println(emp2);
    
    Employee1 emp3=new Employee1(3,"naruto",15);
//    System.out.println(emp3);
    
//    System.out.println(10);
    
    List<Employee1> list=new ArrayList<>();
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    System.out.println("before sort "+list);
     Collections.sort(list);
    System.out.println("After sort "+list);

	}
}


