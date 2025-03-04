// GrandParent
class Multilevel {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent
class Mamal extends Multilevel {
    void walk() {
        System.out.println("Mammal is walking.");
    }
}

// Child
class Cat extends Mamal {
    void meow() {
        System.out.println("Cat Meowing!");
    }
}
