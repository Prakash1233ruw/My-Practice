package collectionn.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
//	class Alpha1 implements Comparator<Employee>{
//
//		@Override
//		public int compare(Employee obj1, Employee obj2) {
//		 if(obj1.id>obj2.id)
//			return 1;
//		 else
//			 return -1;
//		}
//
//	}
		
	

public class ComplexSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp1=new Employee(2,"kakashi",24);
//    System.out.println(emp1);
    
    Employee emp2=new Employee(6,"madara",114);
//    System.out.println(emp2);
    
    Employee emp3=new Employee(3,"naruto",15);
//    System.out.println(emp3);
    
//    System.out.println(10);
    
    List<Employee> list=new ArrayList<>();
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    System.out.println("before sort "+list);
//   Alpha1 alpha =new Alpha1();
//    Collections.sort(list);
    
//    Comparator<Employee> sorting=new Comparator<>()
//    {
//		@Override
//		public int compare(Employee obj1, Employee obj2) {
//		 if(obj1.age>obj2.age)
//			return 1;
//		 else
//			 return -1;
//		}
//
//	
//    };
    
//    Comparator<Employee> sorting=(Employee obj1, Employee obj2)->{
//		 if(obj1.age>obj2.age)
//			return 1;
//		 else
//			 return -1;
//		};

    Collections.sort(list,(Employee obj1, Employee obj2)->{
		 if(obj1.age>obj2.age)
			return 1;
		 else
			 return -1;
		});
    System.out.println("After sort "+list);

	}
}

