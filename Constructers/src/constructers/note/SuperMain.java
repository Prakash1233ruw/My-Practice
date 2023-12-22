package constructers.note;


class Animal {
    Animal() {//The super() keyword is used to invoke the constructor of the immediate parent class (superclass).
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dog constructor");
    }
}
class SuperMain {
    public static void main(String[] args) {
Dog g=new Dog();

    }
}