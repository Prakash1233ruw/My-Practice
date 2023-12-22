package constructers.note;

class MyClass {//The this() keyword is used to invoke the constructor of the same class.
    int x;
    MyClass() {
        this(0); // Calls the parameterized constructor with an argument
        System.out.println("No-argument constructor");
    }

    MyClass(int x) {
        this.x = x;
        System.out.println("Parameterized constructor");
    }
}
class ThisMain {
	public static void main(String[] args) {
		MyClass myClass=new MyClass();
	}
}

