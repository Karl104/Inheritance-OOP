
//parent
class Single {
    String name = "Generic Animal";

    void makeSound() {
        System.out.println("Some Generic Animal Sound");
    }
}

// Child
class Dog extends Single {
    void bark() {
        System.out.println("Dog barks: woof woof");
    }
}
