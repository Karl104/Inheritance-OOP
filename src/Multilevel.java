// Parent
class Multilevel {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child
class Mamal extends Multilevel {
    void walk() {
        System.out.println("Mammal is walking.");
    }
}

// Grandchild
class Cat extends Mamal {
    void meow() {
        System.out.println("Cat Meowing!");
    }
}
