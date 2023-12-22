package constructers.note;
class Student1
{
	private int id;
	private String name;
	
     public Student1(int id, String name)
     {
    	 this();
    	 System.out.println("Parameterized Constructor!");
    	 this.id=id;
    	 this.name=name;
     }
     
     public Student1()
     {
    	 super();
    	 System.out.println("Connected to DB");
    	 System.out.println("zero parameterized Const");
     }
     
     void disp()
     {
    	 System.out.println(id);
    	 System.out.println(name);
     }
}


public class Cons2 
{

	public static void main(String[] args) 
	{
		Student1 st=new Student1(1, "Rohan");
		st.disp();
		
		Student1 st1=new Student1();
		
		
		

	}

}
