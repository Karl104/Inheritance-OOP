
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

        // Hierarchical

        System.out.println("\n==========  Hierarchical Inheritance ========");
        Cow cow = new Cow();
        cow.Makesound();
        cow.moo();

        Horse horse = new Horse();
        horse.Makesound();
        horse.neigh();


        //Multiple with Interface
        System.out.println("\n==========  Multiple Inheritance (via Interfaces) ========");
        Multiple multiple = new Multiple();
        multiple.eat();
        multiple.makeSound();



    }
}