package constructers.note;
class Person{
private	String name;

public Person(String name) {
	super();
	this.name = name;
}
public void display() {
	System.out.println(name +"from the Person");
}

}
class Employee extends Person{
	private Integer id;
	public Employee(String name ,Integer id) {
		super(name);
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	
	
}
public class conSuper {
public static void main(String[] args) {
	Employee employee=new Employee("madara", 8);
	employee.display();
	System.out.println(employee.getId());
}
}

