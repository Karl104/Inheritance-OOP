//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //single
       System.out.println("\n======== Single Inheritance ===========");
        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.makeSound();
        dog.bark();

        // Multilevel

        System.out.println("\n==========  Multilevel Inheritance ========");
        Cat cat = new Cat();
        cat.eat();
        cat.walk();
        cat.meow();



    }
}